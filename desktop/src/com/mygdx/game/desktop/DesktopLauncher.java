package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.TapRipper;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = TapRipper.WIDTH;
		config.height = TapRipper.HEIGHT;
		config.title = TapRipper.TITLE;
		new LwjglApplication(new TapRipper(), config);
	}
}
