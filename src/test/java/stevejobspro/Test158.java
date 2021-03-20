package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test158 
{

	public static void main(String[] args) 
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
