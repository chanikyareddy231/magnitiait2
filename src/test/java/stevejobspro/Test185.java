package stevejobspro;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class Test185 
{
	@Test
	public void method() throws Exception
	{
		Screen s=new Screen();
		s.click("src\\test\\resources\\eclipse.png");
		Thread.sleep(5000);
		ScreenImage si=s.capture(); //full screen
		BufferedImage bi=si.getImage();
		File f=new File("src\\test\\resources\\seleniumworkspacepath.png");
		ImageIO.write(bi,"png",f);
	}

}
