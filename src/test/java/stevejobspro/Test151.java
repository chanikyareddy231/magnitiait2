package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test151 
{
	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.className("hsuHs")); //search
		WebElement e2=driver.findElement(By.className("HPVvwb")); //mic
		WebElement target=driver.findElement(RelativeLocator.withTagName("input").toRightOf(e1).toLeftOf(e2));
		target.sendKeys("chanikyareddy231");
	}
}
