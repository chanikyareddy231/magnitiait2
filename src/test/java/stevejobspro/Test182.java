package stevejobspro;

import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Screen;

public class Test182 
{
	public static void main(String[] args) throws Exception
	{
		Screen s=new Screen();
		s.click("src\\test\\resources\\eclipse.png");
		Thread.sleep(5000);
		s.doubleClick("src\\test\\resources\\google.png");
		Thread.sleep(5000);
		s.doubleClick("src\\test\\resources\\google.co.in.png");
		Thread.sleep(5000);
		//s.click("src\\test\\resources\\goova.png");
		//Thread.sleep(5000);
		s.type("src\\test\\resources\\googlesearchbox.png","chinnapareddy maheshreddy");
		Thread.sleep(5000);
		s.wheel(Button.WHEEL_DOWN,2);
		s.click("src\\test\\resources\\googlesearch.png");
		Thread.sleep(5000);
		Location l1=new Location(330,553);
		l1.click();
		s.click("src\\test\\resources\\googleexit.png");
		Thread.sleep(5000);
		s.rightClick("src\\test\\resources\\batfilemic.png");
		Thread.sleep(5000);
		s.click("src\\test\\resources\\openbat.png");
		Thread.sleep(5000);
		Location l2=new Location(33,133);
		s.wheel(l2,Button.LEFT,2);
		s.click("src\\test\\resources\\openeclipse.png");
		
		
		
	}

}
