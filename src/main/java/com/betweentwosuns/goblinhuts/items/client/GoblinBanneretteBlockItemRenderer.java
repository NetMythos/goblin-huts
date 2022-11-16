package com.betweentwosuns.goblinhuts.items.client;

import com.betweentwosuns.goblinhuts.items.GoblinBanneretteBlockItem;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class GoblinBanneretteBlockItemRenderer extends GeoItemRenderer<GoblinBanneretteBlockItem> {
	public GoblinBanneretteBlockItemRenderer() {
		super(new GoblinBanneretteBlockItemModel());
	}
}
