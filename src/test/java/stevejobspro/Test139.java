package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test139 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rangeslider.js.org");
        Thread.sleep(5000);
        driver.executeScript("window.location='https://www.facebook.com';");
        

	}

}
