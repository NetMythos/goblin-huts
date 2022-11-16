package com.betweentwosuns.goblinhuts;

import com.betweentwosuns.goblinhuts.client.tile.renderer.GoblinBanneretteRenderer;
import com.betweentwosuns.goblinhuts.items.client.GoblinBanneretteBlockItemRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GoblinHutsClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		BlockEntityRendererRegistry.register(GoblinHuts.GOBLIN_BANNERETTE_ENTITY, (BlockEntityRendererFactory.Context rendererDispatcherIn) -> new GoblinBanneretteRenderer());
		GeoItemRenderer.registerItemRenderer(GoblinHuts.GOBLIN_BANNERETTE_BLOCK_ITEM, new GoblinBanneretteBlockItemRenderer());
	}
}
