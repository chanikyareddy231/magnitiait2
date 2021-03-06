package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test144 {

	public static void main(String[] args)
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		//max wait in 20sec,but default interval time is 1000msec
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		try
		{
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept Cookies']"))).click();			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		//Dafine wait condition for calander
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'RadCalendar')]")));
		WebElement e=driver.findElement(By.xpath("//*[contains(@class,'RadCalendar')]"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		//wait,locate and click on a day link
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("22"))).click();
		//Define wait condition for invisibility of loader(spinner)icon
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//close site
		driver.close();
	}

}
