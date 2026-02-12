/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreflowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.moreflowers.block.*;
import net.mcreator.moreflowers.MoreFlowersMod;

public class MoreFlowersModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MoreFlowersMod.MODID);
	public static final DeferredBlock<Block> CYAN_TULIP;
	public static final DeferredBlock<Block> CHRYSANTHEMUM;
	public static final DeferredBlock<Block> LIGHT_BLUE_TULIP;
	public static final DeferredBlock<Block> PURPLE_TULIP;
	public static final DeferredBlock<Block> YELLOW_TULIP;
	public static final DeferredBlock<Block> IRIS_FLOWER;
	public static final DeferredBlock<Block> GESANGFLOWER;
	public static final DeferredBlock<Block> HYACINTH;
	public static final DeferredBlock<Block> REDSPIDERLILY;
	static {
		CYAN_TULIP = REGISTRY.register("cyan_tulip", CyanTulipBlock::new);
		CHRYSANTHEMUM = REGISTRY.register("chrysanthemum", ChrysanthemumBlock::new);
		LIGHT_BLUE_TULIP = REGISTRY.register("light_blue_tulip", LightBlueTulipBlock::new);
		PURPLE_TULIP = REGISTRY.register("purple_tulip", PurpleTulipBlock::new);
		YELLOW_TULIP = REGISTRY.register("yellow_tulip", YellowTulipBlock::new);
		IRIS_FLOWER = REGISTRY.register("iris_flower", IrisFlowerBlock::new);
		GESANGFLOWER = REGISTRY.register("gesangflower", GesangflowerBlock::new);
		HYACINTH = REGISTRY.register("hyacinth", HyacinthBlock::new);
		REDSPIDERLILY = REGISTRY.register("redspiderlily", RedspiderlilyBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}