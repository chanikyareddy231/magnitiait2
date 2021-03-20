package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test133 {

	@Test
	public void method() throws Exception 
	{
		//open browser 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //lanch site
        driver.get("https://www.google.co.in");
        //Do some operations
        //--------
        //-----
        driver.executeScript("history.go(0);");
	}

}
