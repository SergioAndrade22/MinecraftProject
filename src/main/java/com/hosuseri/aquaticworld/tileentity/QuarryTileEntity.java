package com.hosuseri.aquaticworld.tileentity;

import javax.annotation.Nullable;

import com.hosuseri.aquaticworld.util.NBTHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

	public int x, y, z, tick;
	private boolean initialized = false;
	
	public QuarryTileEntity(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
		
	}

	public QuarryTileEntity() {
		this(ModTileEntityTypes.quarry.get());
	}
	
	@Override
	public void tick() {
		if(!initialized)
			init();
		tick++;
		if (tick == 40) {
			tick = 0;
			if(y > 2) 
				execute();
		}
	}
	
	public void execute() {
		int index = 0;
		Block[] blocksRemoved = new Block[9];
		for (int x = 0; x < 3; x++) {
			for (int z =0; z < 3; z++) {
				BlockPos posToBreak = new BlockPos(this.x + x, this.y, this.z + z);
				blocksRemoved[index] = this.world.getBlockState(posToBreak).getBlock();
				destroyBlock(posToBreak, true, null);
				index++;
			}
		}
		this.y--;
	}
	
	public boolean destroyBlock(BlockPos pos, boolean dropBlock, @Nullable Entity entity) {
		BlockState blockState = this.world.getBlockState(pos); 
		if (blockState.isAir(this.world, pos)) // if we are in the air, we want to do nothing
			return false;
		else {
			IFluidState fluidState = this.world.getFluidState(pos); // get if we have a fluid
			this.world.playEvent(2001, pos, Block.getStateId(blockState)); // 2001 plays the sound of the block being break
			if(dropBlock) { // if we want to drop the block 
				TileEntity tileEntity = blockState.hasTileEntity() ? this.world.getTileEntity(pos) : null; // check if it has a tile entity on that block
				Block.spawnDrops(blockState, this.world, this.pos.add(0, 1.5, 0), tileEntity, entity, ItemStack.EMPTY); // we pass the parameters for the world to break the block
				// we added 1.5 to the Y positions so that the drop does not spawn in the middle of the block
				// it takes the tile entity so in case it has some items inside it will drop them too
			}
			return world.setBlockState(pos, fluidState.getBlockState(), 3); // 3 is a flag, God knows what it does
		}
	}
	
	private void init() {
		initialized = true;
		x = this.pos.getX() - 1;
		y = this.pos.getY() - 1;
		z = this.pos.getZ() - 1;
		tick = 0;
		
	}
	
	@Override
	public CompoundNBT write(CompoundNBT compound) {
		compound.put("init_values", NBTHelper.toNBT(this));
		return super.write(compound);
	}
	
	@Override
	public void read(CompoundNBT compound) {
		super.read(compound);
		CompoundNBT initValues = compound.getCompound("init_values");
		if (initValues != null) {
			this.x = initValues.getInt("x");
			this.y = initValues.getInt("y");
			this.z = initValues.getInt("z");
			this.tick = 0;
			this.initialized = true;
		}
		else
			init();
	}
}
