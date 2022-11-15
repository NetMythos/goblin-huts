package com.betweentwosuns.goblinhuts;

import com.betweentwosuns.goblinhuts.client.tile.renderer.GoblinBanneretteRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

public class GoblinHutsClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		BlockEntityRendererRegistry.register(GoblinHuts.GOBLIN_BANNERETTE_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GoblinBanneretteRenderer());
	}
}
