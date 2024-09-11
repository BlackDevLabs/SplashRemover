package gg.blackdev.splashremover.mixin;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.SplashTextRenderer;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SplashTextRenderer.class)
public class SplashMixin {

    /**
     * @author BlackDev
     * @reason mod purpose lol
     */
    @Overwrite
    public void render(DrawContext context, int screenWidth, TextRenderer textRenderer, int alpha) {
    }

}
