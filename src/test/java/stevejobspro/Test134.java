package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test134 {

	@Test
	public void method() throws Exception
	{
		//open browser 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //lanch site and locate an image to test immediatly
        driver.get("https://www.facebook.com");
        WebElement e=driver.findElement(By.xpath("//img[@alt='Facebook']"));
        //image load testing
        boolean result=(boolean) driver.executeScript("return(arguments[0].complete && "+
                                        "arguments[0].naturalHeight>0 && "+
        		                        "arguments[0].naturalWidth>0);",e);
        if(result==true)
        {
        	System.out.println("image was loaded completly");
        	if(e.isDisplayed())
        	{
        		System.out.println("image is visible");
        	}
        	else 
        	{
        		System.out.println("image is not visible");
        	}
        }
        else
        {
        	System.out.println("image was not loaded completly");
        }
        //close site 
        driver.close();
	}

}
