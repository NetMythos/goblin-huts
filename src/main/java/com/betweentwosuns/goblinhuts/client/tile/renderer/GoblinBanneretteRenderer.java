package com.betweentwosuns.goblinhuts.client.tile.renderer;

import com.betweentwosuns.goblinhuts.block.tile.GoblinBanneretteTileEntity;
import com.betweentwosuns.goblinhuts.client.tile.model.GoblinBanneretteModel;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class GoblinBanneretteRenderer extends GeoBlockRenderer<GoblinBanneretteTileEntity> {
	
	public GoblinBanneretteRenderer() {
		super(new GoblinBanneretteModel());
	}
}
