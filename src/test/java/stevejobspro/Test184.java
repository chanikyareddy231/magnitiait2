package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test184
{
	@Test
	public void method() throws Exception
	{
		///open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("http://www.youtube.com");
		FluentWait w=new FluentWait(driver);
		w.withTimeout(Duration.ofMillis(20000));
		w.pollingEvery(Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
		driver.findElement(By.name("search_query")).sendKeys("abdul kalam sir speeches");
		driver.findElement(By.id("search-icon-legacy")).click();
		WebElement j=(WebElement) w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='APJ Abdul Kalam Inspiring Speech on India at European Parliament']")));
		j
		.click();
		Screen s=new Screen();
		if(s.exists("src\\test\\resources\\skipadd.png",10) != null)
		{
			s.click("src\\test\\resources\\skipadd.png");
		}
		Location l1=new Location(200,300);
		s.wheel(l1,Button.LEFT,0); //0 means no click,just move mouse pointer to video body
		Thread.sleep(5000);
		s.click("src\\test\\resources\\play.png");
		Thread.sleep(5000);
		s.click("src\\test\\resources\\pause.png");
		Thread.sleep(5000);
		s.mouseMove("src\\test\\resources\\volume.png");
		Thread.sleep(5000);
		Match e=s.find("src\\test\\resources\\bubble.png");
		int x1=e.getX();
		int y1=e.getY();
		Location l2=new Location(x1-50,y1);
		s.dragDrop(e,l2); //decrease volume
		Thread.sleep(5000);
		int x2=e.getX();
		int y2=e.getY();
		Location l3=new Location(x2+50,y2);
		s.dragDrop(e,l3); //increase volume
		Thread.sleep(10000);
		s.click("src\\test\\resources\\closeyoutube.png");
		
		
		
	}

}
