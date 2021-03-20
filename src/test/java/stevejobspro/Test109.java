package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test109 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com");
		Thread.sleep(5000);
		try
		{
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}
		catch(Exception ex)
		{
		}
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(e).perform();
		//close site
		driver.close();
		

	}

}
