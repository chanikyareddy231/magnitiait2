package stevejobspro;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test150 {

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://www.groupboard.com/demo/groupboard-online-whiteboard-demo.shtml");
		Thread.sleep(5000);
		//Clear existing drawing if exists
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Got It!']"))).click();
		Thread.sleep(5000);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		w.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		w.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(5000);
		Point headerorigin=new Point(450,250);
		Point leftEyeorigin=headerorigin.moveBy(-50,-50);
		Point rightEyeorigin=headerorigin.moveBy(50,-50);
		Point mouthorigin=headerorigin.moveBy(0,50);
		drawCircle(driver,headerorigin,150,60,"full");
		drawCircle(driver,leftEyeorigin,20,20,"full");
		drawCircle(driver,rightEyeorigin,20,20,"full");
		drawCircle(driver,mouthorigin,40,30,"half");
		Thread.sleep(5000);
		//Clear finished drawings
		w.until(ExpectedConditions.elementToBeClickable(By.id("trash"))).click();
		w.until(ExpectedConditions.alertIsPresent()).accept();
		//Close site
		driver.switchTo().defaultContent();
		driver.close();
	}
	public static void drawCircle(ChromeDriver driver,Point origin,double radius,int steps,String style)
	{
	    Point firstPoint=new Point((int)(origin.x+radius),origin.y);
	    PointerInput pi=new PointerInput(PointerInput.Kind.MOUSE,"mouse");
	    Sequence circle=new Sequence(pi,0);
	    //1.move to first point
	    circle.addAction(pi.createPointerMove(Duration.ofMillis(20),PointerInput.Origin.viewport(),firstPoint.x,firstPoint.y));
	    //2.click and hold mouse left button
	    circle.addAction(pi.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    //3.move to various points via loop
	    int p=steps;
	    if(style.equalsIgnoreCase("half"))
	    {
	    	p=steps/2;
	    }
	    
	    for (int i=0;i<=p;i++)
	    {
	    	double theta=2*Math.PI*((double)i/steps);
	    	int xoffset=(int)Math.floor(Math.cos(theta)*radius);
	    	int yoffset=(int)Math.floor(Math.sin(theta)*radius);
	    	Point nextpoint=new Point(origin.x+ xoffset,origin.y+ yoffset);
	    	circle.addAction(pi.createPointerMove(Duration.ofMillis(50),PointerInput.Origin.viewport(),nextpoint.x,nextpoint.y));
	    }
	    //4.release mouse left button
	    circle.addAction(pi.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    //perform all defined actions
        driver.perform(Arrays.asList(circle));	
	}

}
