package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test153 {

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//*[text()='Continue to Gmail']"));
		WebElement e2=driver.findElement(By.xpath("//*[text()='Forgot email?']"));
		WebElement target1=driver.findElement(RelativeLocator.withTagName("input").below(e1).above(e2));
		target1.sendKeys("chanikyareddy231");
		Thread.sleep(5000);
		WebElement e3=driver.findElement(By.xpath("//*[text()='Create account']"));
		RelativeLocator.withTagName("button").near(e3);
		WebElement target2=driver.findElement(RelativeBy.xpath("//*[@type='button']"));
		target2.click();

	}

}
