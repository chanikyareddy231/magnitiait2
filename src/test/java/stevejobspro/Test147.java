package stevejobspro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test147 {

	public static void main(String[] args) 
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
		ExpectedCondition<Boolean> ec1=ExpectedConditions.invisibilityOfElementLocated(By.name("q"));
		w.until(ExpectedConditions.not(ec1));
		//close site
		driver.close();
	}

}
