package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test149 {

	public static void main(String[] args) 
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://www.gmail.com");
		//max wait in 20sec,but interval time is 1000msec
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		w.until(waitAndFill(By.name("identifier"),"chanikyareddy231"));
		w.until(waitAndClick(By.xpath("//button[@type='button']/child::div[2]")));
		w.until(waitAndFill(By.name("password"),"Chanikya231"));
		w.until(waitAndClick(By.xpath("//div[@id='passwordNext']/descendant::div[3]")));
	}
	public static ExpectedCondition<Boolean> waitAndClick(By b)
	{
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver driver)
			{
				try
				{
				driver.findElement(b).click();
				return(true);
				}
				catch (Exception ign)
				{
					return(false);
				}
			}
		};
		return(ec);
	}
	public static ExpectedCondition<Boolean> waitAndFill(By b,String x)
	{
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver driver)
			{
				try
				{
				driver.findElement(b).sendKeys(x);
				return(true);
				}
				catch (Exception ign)
				{
					return(false);
				}
			}
		};
		return(ec);
	}
}

