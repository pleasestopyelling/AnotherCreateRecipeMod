package net.cutecharm.anothercreaterecipemod.mixin;

import net.cutecharm.anothercreaterecipemod.AnotherCreateRecipeMod;

import net.minecraft.client.Minecraft;

import net.minecraft.client.main.GameConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
	@Inject(method = "<init>", at = @At("TAIL"))
	private void example$init(GameConfig gameConfig, CallbackInfo ci) {
		AnotherCreateRecipeMod.LOGGER.info("Hello from {}", AnotherCreateRecipeMod.NAME);
	}
}
