package com.purpendiculr.extensions.controllers.presonus.atom;

import com.bitwig.extension.api.Color;

public class ColorUtils {
	public static Color darken(Color color) {
		return darken(color, 0.7);
	}
	
	public static Color darken(Color color, double factor) {
		final double red = color.getRed() * factor;
		final double green = color.getGreen() * factor;
		final double blue = color.getBlue() * factor;

		return Color.fromRGB(red, green, blue);
	}
	
	public static Color mixColorWithWhite(final Color color, final int velocity) {
		final float x = velocity / 127.f;
		final double red = color.getRed() * (1 - x) + x;
		final double green = color.getGreen() * (1 - x) + x;
		final double blue = color.getBlue() * (1 - x) + x;

		return Color.fromRGB(red, green, blue);
	}
}
