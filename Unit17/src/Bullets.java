import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bullets {
	private List<Ammo> ammo;

	private int tick;
	private boolean bulletReady = true;

	public Bullets() {
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al) {
		if (bulletReady){
			ammo.add(al);
		bulletReady = false;
		} 
		

	}

	// post - draw each Ammo
	public void drawEmAll(Graphics window) {
		for (int i = 0; i < ammo.size(); i++) {
			ammo.get(i).draw(window);

		}
	}

	public void moveEmAll() {
		for (int i = 0; i < ammo.size(); i++) {
			ammo.get(i).move("up");
		}
	}

	public void cleanEmUp() {
		for (int i = 0; i < ammo.size(); i++) {
			if (ammo.get(i).getY() < 0) {
				ammo.remove(i);
				i--;
			}
		}
	}

	public List<Ammo> getList() {
		return ammo;
	}

	public void bulletSpacer() {
		tick++;
		if (tick >= 70) {
			bulletReady = true;
			tick = 0;
		}
	}

	public String toString() {
		return Arrays.toString(ammo.toArray());

	}
}