package stevejobspro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test126 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/questions/38653910/actions-click-script-selenium");
        Thread.sleep(5000);
        //page down
        Actions a=new Actions(driver);
        a.sendKeys(Keys.END).perform();
        Thread.sleep(5000);
        //page up
        a.sendKeys(Keys.HOME).perform();
        
	}

}
