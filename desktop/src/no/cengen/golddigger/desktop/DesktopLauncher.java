package no.cengen.golddigger.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import no.cengen.golddigger.GoldDigger;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

		cfg.title = "gold-digger";
		cfg.useGL30 = false;
		cfg.width = 480;
		cfg.height = 320;

		new LwjglApplication(new GoldDigger(), cfg);
	}
}
