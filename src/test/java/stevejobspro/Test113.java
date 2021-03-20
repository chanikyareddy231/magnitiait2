package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test113 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.linkText("Gmail"));
		//act.keyDown(e,Keys.ENTER).keyUp(e,Keys.ENTER).build().perform();
		act.sendKeys(e,Keys.ENTER);
	}

}
