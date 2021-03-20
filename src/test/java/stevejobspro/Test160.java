package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test160 {

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.silentOutput","true"); //to avoid logs
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[]{"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s); //to avoid automation banner
		co.addArguments("--disable-notifications"); //to avoid web push notifications
		co.addArguments("--start-maximized"); //to maximize browser window
		ChromeDriver driver=new ChromeDriver(co);    
		driver.get("https://www.redbus.in");

	}

}
