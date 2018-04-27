import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.imageio.ImageIO;

public class Lifes extends MovingThing
{
	private int speed;
	private Image image;

	public Lifes()
	{
		this(0,0,20,20,0);
	}

	public Lifes(int x, int y)
	{
		super(x,y);
	}

	public Lifes(int x, int y, int s)
	{
		super(x,y);
		speed=s;
	}

	public Lifes(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("life.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	  speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(Ship ship)
	{
	   
	   int randomNumber1=20 + (int)(Math.random() * ((740 - 20) + 1));
	   setX(randomNumber1);
	   int randomNumber2=20 + (int)(Math.random() * ((370 - 20) + 1));
	   setY(randomNumber2);
	   
	
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		
	}
}