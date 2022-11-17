package com.betweentwosuns.goblinhuts;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

import com.betweentwosuns.goblinhuts.block.GoblinBanneretteBlock;
import com.betweentwosuns.goblinhuts.block.tile.GoblinBanneretteTileEntity;
import com.betweentwosuns.goblinhuts.items.GoblinBanneretteBlockItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoblinHuts implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("goblinhuts");

	public static final GoblinBanneretteBlock GOBLIN_BANNERETTE = new GoblinBanneretteBlock();
	public static final BlockEntityType<GoblinBanneretteTileEntity> GOBLIN_BANNERETTE_ENTITY = Registry.register(
			Registry.BLOCK_ENTITY_TYPE,
			new Identifier("goblinhuts", "goblin_bannerette_entity"),
			FabricBlockEntityTypeBuilder.create(GoblinBanneretteTileEntity::new, GOBLIN_BANNERETTE).build()
			);
	public static final GoblinBanneretteBlockItem GOBLIN_BANNERETTE_BLOCK_ITEM = new GoblinBanneretteBlockItem(GOBLIN_BANNERETTE, new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Goblins chew and goblins bite!");

		GeckoLib.initialize();

		Registry.register(Registry.BLOCK, new Identifier("goblinhuts", "goblin_bannerette"), GOBLIN_BANNERETTE);
		Registry.register(Registry.ITEM, new Identifier("goblinhuts", "goblin_bannerette"), GOBLIN_BANNERETTE_BLOCK_ITEM);
	}
}
