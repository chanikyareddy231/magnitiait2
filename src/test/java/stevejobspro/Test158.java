package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test158 
{

	@Test
	public void method() throws Exception 
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.silentOutput","true");
		ChromeDriver driver=new ChromeDriver();    
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://angularjs.org");

	}

}
