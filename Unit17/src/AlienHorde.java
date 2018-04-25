//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int tick;
	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);

	}

	public void drawEmAll( Graphics window )
	{
		for (Alien alien : aliens) {
			alien.draw(window);
		}
	}

	public void moveEmAll() {
		tick++;
		for (Alien alien : aliens) {
			if (tick <= 200) {
				alien.move("left");
			} else if (tick <= 220) {
				alien.move("down");
			} else if (tick <= 420) {
				alien.move("right");
			} 
			 else if (tick <= 440) {
					alien.move("down");
				} else {
				tick = 0;
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < shots.size(); i++) {
			for (int j = 0; j < aliens.size(); j++) {
				try {
					if (shots.get(i).isCollide(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						i--;
						j--;
					}
				} catch (ArrayIndexOutOfBoundsException e) {

				}
			}

		}
	}
	public String toString()
	{
		return "";
	}
}
