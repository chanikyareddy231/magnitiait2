package stevejobspro;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test159 
{

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.firefoxdriver().setup();
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\images.txt");  //to avoid logs
		FirefoxDriver driver=new FirefoxDriver();   
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://angularjs.org");

	}

}
