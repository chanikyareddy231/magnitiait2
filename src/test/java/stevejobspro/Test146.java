package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test146 {

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://www.google.co.in");
		//max wait in 20sec,but interval time is 1000msec
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofMillis(1000));
		ExpectedCondition<WebElement> ec1=ExpectedConditions.visibilityOfElementLocated(By.name("q"));
		ExpectedCondition<Boolean> ec2=ExpectedConditions.attributeToBe(By.name("q"),"title","search");
		w.until(ExpectedConditions.or(ec1,ec2));
		//close site
		driver.close();
	}

}
