package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test115 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		//change-1:background colour to green
		driver.executeScript("arguments[0].style.background='green';",e);
		Thread.sleep(5000);
		//change-2:enter text in red colour
		driver.executeScript("arguments[0].style.colour='red';",e);
		driver.executeScript("arguments[0].value='mahesh reddy';",e);
		Thread.sleep(5000);
		//change-3:highlight that element with solid line in blue
		driver.executeScript("arguments[0].style.border='5px blue solid';",e);
		Thread.sleep(5000);
		//refresh page to remove all changes
		driver.navigate().refresh();
	}

}
