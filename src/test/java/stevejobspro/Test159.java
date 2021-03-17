package stevejobspro;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test159 
{

	public static void main(String[] args) 
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
