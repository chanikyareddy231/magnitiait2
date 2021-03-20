package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test148 {

	@Test
	public void method() throws Exception
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
		WebElement e=w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		e.sendKeys("chanikyareddy231@gmail.com");
		//Do changes in DOM
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']/parent::button"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.navigate().back();
		//Chances for StaleElementReferenceException due to DOM changes
		if(w.until(ExpectedConditions.stalenessOf(e)))
		{
			e=w.until(ExpectedConditions.refreshed
					             (ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))));
		}
		e.clear();
		e.sendKeys("chanikyareddy23");
		//close site
		driver.close();
	}

}
