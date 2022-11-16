package com.betweentwosuns.goblinhuts.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class GoblinBanneretteBlockItem extends BlockItem implements IAnimatable {
	public AnimationFactory factory = GeckoLibUtil.createFactory(this); 

	public GoblinBanneretteBlockItem(Block block, Settings settings) {
		super(block, settings);
	}

	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		return PlayState.CONTINUE;
	}

	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<GoblinBanneretteBlockItem>(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
}
