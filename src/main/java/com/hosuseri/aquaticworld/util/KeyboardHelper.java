package com.hosuseri.aquaticworld.util;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class KeyboardHelper {
	private static final long HANDLE = Minecraft.getInstance().getMainWindow().getHandle();
	
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingShift() {
		return InputMappings.isKeyDown(HANDLE, GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(HANDLE, GLFW.GLFW_KEY_RIGHT_SHIFT);
	}
	
	@OnlyIn(Dist.CLIENT)
	public static boolean isHoldingControl() {
		return InputMappings.isKeyDown(HANDLE, GLFW.GLFW_KEY_LEFT_CONTROL) || InputMappings.isKeyDown(HANDLE, GLFW.GLFW_KEY_RIGHT_CONTROL);
	}
}