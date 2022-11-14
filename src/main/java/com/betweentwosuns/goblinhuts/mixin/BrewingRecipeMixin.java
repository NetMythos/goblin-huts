package com.betweentwosuns.goblinhuts.mixin;

import com.betweentwosuns.goblinhuts.GoblinHuts;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;

@Mixin(BrewingRecipeRegistry.class)
public abstract class BrewingRecipeMixin {
	@Shadow
	private static void registerPotionRecipe(Potion input, Item item, Potion output) {}

	@Inject(method = "registerDefaults", at = @At("TAIL"))
	private static void potionRecipes(CallbackInfo ci) {
		registerPotionRecipe(Potions.AWKWARD, GoblinHuts.GOBLIN_EAR, Potions.LEAPING);
	}
}
