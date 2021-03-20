package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test130 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/questions/38653910/actions-click-script-selenium");
        Thread.sleep(5000);
        //Get visibility of element of page in desktop
        WebElement e=driver.findElement(By.xpath("(//pre)[1]"));
        driver.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(5000);
        //element scroll down
        driver.executeScript("var x=arguments[0].scrollHieght;arguments[0].scrollTop=x;",e);
        Thread.sleep(5000);
        //element scroll up
        driver.executeScript("arguments[0].scrollTop=0;",e);
        Thread.sleep(5000);
        //element scroll left
        driver.executeScript("var x=arguments[0].scrollWidth;arguments[0].scrollLeft=x;",e);
        Thread.sleep(5000);
        //element scroll right
        driver.executeScript("arguments[0].scrollLeft=0;",e);
        Thread.sleep(5000);
        //close site
        driver.close();
	}

}
