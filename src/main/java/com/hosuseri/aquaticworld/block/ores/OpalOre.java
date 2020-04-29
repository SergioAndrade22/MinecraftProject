package com.hosuseri.aquaticworld.block.ores;

import java.util.Random;

import com.hosuseri.aquaticworld.util.AquaticWorldItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class OpalOre extends Block {

	private static Block.Properties props = Block.Properties.create(Material.ROCK).hardnessAndResistance(10f, 20f).sound(SoundType.STONE).harvestLevel(5).harvestTool(ToolType.PICKAXE);
	private BlockItem item;
	private final String name = "opal_ore";
	
	public OpalOre() {
		super(props);
		
		setRegistryName(name);
		
		Item.Properties item_props = new Item.Properties();
		item_props.maxStackSize(64);
		item_props.group(AquaticWorldItemGroup.instance);
		
		item = new BlockItem(this, item_props);
		item.setRegistryName(name);
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? MathHelper.nextInt(new Random(), 8, 10) : 0;
	}
	
	@Override
	public Item asItem() {
		return item;
	}
}