package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test136 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
        Thread.sleep(5000);
        //Locate element Which type is 'file'
        driver.switchTo().frame("iframeResult");
        WebElement e=driver.findElement(By.xpath("//input[@id='myFile']"));
        String f="C:\\mahesh\\geckodriver-v0.27.0-win64";
        //way-1(SWD-java)
       // e.sendKeys(f);
        //way-2(javaScript)
        driver.executeScript("arguments[0].value=arguments[1];",e,f);
        //way-3 (javaRobot)
	}

}
