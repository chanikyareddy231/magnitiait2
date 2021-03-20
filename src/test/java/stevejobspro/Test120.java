package stevejobspro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test120 
{
	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Locate hidden elements(Using javaScript)
		List<WebElement> hitems=driver.findElements(By.xpath("(//div[text()='Gender'])[1]/following-sibling::div/div"));
		for(WebElement hitem:hitems)
		{
			String x=(String) driver.executeScript("return(arguments[0].textContent);",hitem);
			System.out.println(x);
		}
		//close site
		driver.close();

	}

}
