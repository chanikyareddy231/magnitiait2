package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test119 
{
	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://material-components.github.io/material-components-web-components/demos/switch.html");
		Thread.sleep(5000);
        //switch-1
		//1.find the externally visible element(SWD)
		WebElement ee1=(WebElement) driver.findElement(By.xpath("//mwc-switch[1]"));
		//2.Now we can use it to find the target element under shadow root(javaScript)
		WebElement e1e1=(WebElement) driver.executeScript("return(arguments[0].shadowRoot.querySelector('input[id=basic-switch]'));",ee1);
		try
		{
			String x=ee1.getAttribute("checked");
			if(x.equals("true"))
			{
				System.out.println("Switch is already in ON by default,so leave it");
			}
			else
			{
				System.out.println("Switch is in OFF by default,so goto ON");
				e1e1.click(); //on the Switch
			}
		}
		catch(Exception ex)
		{
			System.out.println("Switch is in OFF by default,so goto ON");
			e1e1.click(); //on the Switch
		}
		Thread.sleep(5000);
		//switch-2
		//1.find the externally visible element(SWD)
		WebElement ee2=(WebElement) driver.findElement(By.xpath("//mwc-switch[2]"));
		//2.Now we can use it to find the target element under shadow root(javaScript)
		WebElement e1e2=(WebElement) driver.executeScript("return(arguments[0].shadowRoot.querySelector('input[role=switch]'));",ee2);
		try
		{
			String x=ee2.getAttribute("checked");
			if(x.equals("true"))
			{
				System.out.println("Switch is already in ON by default,so leave it");
			}
			else
			{
				System.out.println("Switch is in OFF by default,so goto ON");
				e1e2.click(); //on the Switch
			}
		}
		catch(Exception ex)
		{
			System.out.println("Switch is in OFF by default,so goto ON");
			e1e2.click(); //on the Switch
		}
		Thread.sleep(5000);
		//close site
		driver.close();
	}
}
