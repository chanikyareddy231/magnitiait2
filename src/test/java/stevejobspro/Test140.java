package stevejobspro;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test140 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in");
		Thread.sleep(5000);
		//run JavaScript code asynchronously(irrespective of order of statements)
		driver.executeAsyncScript("window.setTimeout(function(){window.alert('Mahesh reddy');},1000); "
				+ "window.alert('hi');");
		
	}

}
