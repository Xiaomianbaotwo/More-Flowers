/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreflowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.moreflowers.MoreFlowersMod;

@EventBusSubscriber
public class MoreFlowersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreFlowersMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MORE_FLOWERS = REGISTRY.register("more_flowers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.more_flowers.more_flowers")).icon(() -> new ItemStack(MoreFlowersModBlocks.CHRYSANTHEMUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreFlowersModBlocks.CYAN_TULIP.get().asItem());
				tabData.accept(MoreFlowersModBlocks.LIGHT_BLUE_TULIP.get().asItem());
				tabData.accept(MoreFlowersModBlocks.PURPLE_TULIP.get().asItem());
				tabData.accept(MoreFlowersModBlocks.YELLOW_TULIP.get().asItem());
				tabData.accept(MoreFlowersModBlocks.CHRYSANTHEMUM.get().asItem());
				tabData.accept(MoreFlowersModBlocks.GESANGFLOWER.get().asItem());
				tabData.accept(MoreFlowersModBlocks.REDSPIDERLILY.get().asItem());
				tabData.accept(MoreFlowersModBlocks.IRIS_FLOWER.get().asItem());
				tabData.accept(MoreFlowersModBlocks.HYACINTH.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MoreFlowersModBlocks.CYAN_TULIP.get().asItem());
			tabData.accept(MoreFlowersModBlocks.LIGHT_BLUE_TULIP.get().asItem());
			tabData.accept(MoreFlowersModBlocks.PURPLE_TULIP.get().asItem());
			tabData.accept(MoreFlowersModBlocks.YELLOW_TULIP.get().asItem());
			tabData.accept(MoreFlowersModBlocks.CHRYSANTHEMUM.get().asItem());
			tabData.accept(MoreFlowersModBlocks.REDSPIDERLILY.get().asItem());
			tabData.accept(MoreFlowersModBlocks.GESANGFLOWER.get().asItem());
			tabData.accept(MoreFlowersModBlocks.IRIS_FLOWER.get().asItem());
			tabData.accept(MoreFlowersModBlocks.HYACINTH.get().asItem());
		}
	}
}