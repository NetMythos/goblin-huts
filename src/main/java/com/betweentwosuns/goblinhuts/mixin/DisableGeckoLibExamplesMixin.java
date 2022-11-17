package com.betweentwosuns.goblinhuts.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import software.bernie.example.GeckoLibMod;

@Mixin(GeckoLibMod.class)
public class DisableGeckoLibExamplesMixin
{
	@Inject(method = "<clinit>", at = @At("TAIL")) 
	private static void disableExamples(CallbackInfo info) {
		GeckoLibMod.DISABLE_IN_DEV = true;
	}
}
