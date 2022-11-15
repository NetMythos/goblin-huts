package com.betweentwosuns.goblinhuts.client.tile.model;

import com.betweentwosuns.goblinhuts.block.tile.GoblinBanneretteTileEntity;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoblinBanneretteModel extends AnimatedGeoModel<GoblinBanneretteTileEntity> {
	private static final Identifier modelResource = new Identifier("goblinhuts", "geo/goblin_bannerette.geo.json");
	private static final Identifier textureResource = new Identifier("goblinhuts", "textures/block/goblin_bannerette.png");
	private static final Identifier animationResource = new Identifier("goblinhuts", "animations/goblin_bannerette.animation.json");

	@Override
	public Identifier getModelLocation(GoblinBanneretteTileEntity object) {
		return modelResource;
	}

	@Override
	public Identifier getTextureLocation(GoblinBanneretteTileEntity object) {
		return textureResource;
	}

	@Override
	public Identifier getAnimationFileLocation(GoblinBanneretteTileEntity object) {
		return animationResource;
	}
}
