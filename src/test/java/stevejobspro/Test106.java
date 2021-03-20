package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test106 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.name("email"));
		WebElement e2=driver.findElement(By.name("pass"));
		act.sendKeys(e1,"9090909090").perform();
		act.moveToElement(e2).sendKeys("ourkalamsir",Keys.ENTER).perform();
		Thread.sleep(5000);
		//close site
		driver.close();

	}

}
