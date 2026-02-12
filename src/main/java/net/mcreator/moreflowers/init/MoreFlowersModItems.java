/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreflowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moreflowers.MoreFlowersMod;

public class MoreFlowersModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MoreFlowersMod.MODID);
	public static final DeferredItem<Item> CYAN_TULIP = block(MoreFlowersModBlocks.CYAN_TULIP);
	public static final DeferredItem<Item> CHRYSANTHEMUM = block(MoreFlowersModBlocks.CHRYSANTHEMUM);
	public static final DeferredItem<Item> LIGHT_BLUE_TULIP = block(MoreFlowersModBlocks.LIGHT_BLUE_TULIP);
	public static final DeferredItem<Item> PURPLE_TULIP = block(MoreFlowersModBlocks.PURPLE_TULIP);
	public static final DeferredItem<Item> YELLOW_TULIP = block(MoreFlowersModBlocks.YELLOW_TULIP);
	public static final DeferredItem<Item> IRIS_FLOWER = block(MoreFlowersModBlocks.IRIS_FLOWER);
	public static final DeferredItem<Item> GESANGFLOWER = block(MoreFlowersModBlocks.GESANGFLOWER);
	public static final DeferredItem<Item> HYACINTH = block(MoreFlowersModBlocks.HYACINTH);
	public static final DeferredItem<Item> REDSPIDERLILY = block(MoreFlowersModBlocks.REDSPIDERLILY);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}