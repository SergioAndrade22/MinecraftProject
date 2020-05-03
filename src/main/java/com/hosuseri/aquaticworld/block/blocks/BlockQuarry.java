package com.hosuseri.aquaticworld.block.blocks;

import com.hosuseri.aquaticworld.tileentity.ModTileEntityTypes;
import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class BlockQuarry extends Block {

	private static Properties props = Block.Properties.create(Material.SAND).hardnessAndResistance(4f, 7.0f).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL).harvestLevel(1);
	private BlockItem item; 
	public static final String name = "quarry_block";
	
	public BlockQuarry() {
		super(props);
		
		Item.Properties item_props = new Item.Properties();
		item_props.maxStackSize(64);
		item_props.group(AquaticWorldItemGroup.instance);
		
		item = new BlockItem(this, item_props);
		item.setRegistryName(name);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return ModTileEntityTypes.quarry.get().create();
	}
	
	@Override
	public Item asItem() {
		return item;
	}
}
