package com.betweentwosuns.goblinhuts.items.client;

import com.betweentwosuns.goblinhuts.items.GoblinBanneretteBlockItem;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoblinBanneretteBlockItemModel extends AnimatedGeoModel<GoblinBanneretteBlockItem> {
	private static final Identifier modelResource = new Identifier("goblinhuts", "geo/goblin_bannerette.geo.json");
	private static final Identifier textureResource = new Identifier("goblinhuts", "textures/block/goblin_bannerette.png");
	private static final Identifier animationResource = new Identifier("goblinhuts", "animations/goblin_bannerette.animation.json");

	@Override
	public Identifier getModelLocation(GoblinBanneretteBlockItem object) {
		return modelResource;
	}

	@Override
	public Identifier getTextureLocation(GoblinBanneretteBlockItem object) {
		return textureResource;
	}

	@Override
	public Identifier getAnimationFileLocation(GoblinBanneretteBlockItem object) {
		return animationResource;
	}
}
