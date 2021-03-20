package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test127 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        //change browser window size to get scroll bars
        Dimension d=new Dimension(400,400);
        driver.manage().window().setSize(d);
        Thread.sleep(5000);
        //scroll down
        //driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        driver.executeScript("window.scrollBy(0,document.body.scrollHieght);");
        Thread.sleep(5000);
        //scroll up
        //driver.executeScript("window.scrollTo(document.body.scrollHieght,0);");
        driver.executeScript("window.scrollBy(0,-(document.body.scrollHieght));");
        Thread.sleep(5000);
        //scroll right
        driver.executeScript("window.scrollBy(document.body.scrollWidth,0);");
        Thread.sleep(5000);
        //scroll left
        driver.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
        Thread.sleep(5000);
        //scroll to specific element
        WebElement e=driver.findElement(By.name("email"));
        driver.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(5000);
        //close site
        driver.close();
	}

}
