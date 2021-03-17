package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test129 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/questions/38653910/actions-click-script-selenium");
        Thread.sleep(5000);
        //page down
        Actions act=new Actions(driver);
        act.sendKeys(Keys.END).perform();
        Thread.sleep(5000);
        //element down
        WebElement e=driver.findElement(By.xpath("//pre[contains(@class,'lang-java')][1]"));
        act.sendKeys(e,Keys.END).perform();
        Thread.sleep(5000);
        //element up
        act.sendKeys(e,Keys.HOME).perform();
        Thread.sleep(5000);
        //page up
        act.sendKeys(Keys.HOME).perform();
        Thread.sleep(5000);
        //close site
        driver.close();
        

	}

}
