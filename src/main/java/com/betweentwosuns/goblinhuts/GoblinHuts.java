package com.betweentwosuns.goblinhuts;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoblinHuts implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("goblinhuts");

	public static final Item GOBLIN_EAR = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final GoblinBannerette GOBLIN_BANNERETTE = new GoblinBannerette(FabricBlockSettings.of(Material.WOOL));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Goblins chew and goblins bite!");

		Registry.register(Registry.ITEM, new Identifier("goblinhuts", "goblin_ear"), GOBLIN_EAR);
		
		Registry.register(Registry.BLOCK, new Identifier("goblinhuts", "goblin_bannerette"), GOBLIN_BANNERETTE);
		Registry.register(Registry.ITEM, new Identifier("goblinhuts", "goblin_bannerette"), new BlockItem(GOBLIN_BANNERETTE, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
