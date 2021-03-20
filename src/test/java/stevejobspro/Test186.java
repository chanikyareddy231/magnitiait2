package stevejobspro;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test186 
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("src\\test\\resources\\eclipse.png");
		Thread.sleep(5000);
		Region r=new Region(1202,620,300,400); //x,y,width and height
		ScreenImage si=s.capture(r); //full screen
		BufferedImage bi=si.getImage();
		File f=new File("src\\test\\resources\\ball2.png");
		ImageIO.write(bi,"png",f);
	}

}
