package com.poi.boxcir.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.poi.boxcir.BoxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60; // Modifies FPS (Currently 60)
		config.title = "Enter Title Here"; // Self-explanatory
		new LwjglApplication(new BoxGame(), config);
	}
}
