package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test131 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/questions/38653910/actions-click-script-selenium");
        Thread.sleep(5000);
        //zoom in(using javascript)
        driver.executeScript("document.body.style.zoom='200%';");
        Thread.sleep(5000);
      //zoom out(using javascript)
        driver.executeScript("document.body.style.zoom='100%';");
        Thread.sleep(5000);
        //close site
        driver.close();
	}

}
