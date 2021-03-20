package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test111 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider");
		Thread.sleep(5000);
		//switch to frame
		//Horizontal slider
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/span"));
	    Actions act=new Actions(driver);
        act.dragAndDropBy(e1, 400,0).perform(); //left to right
        Thread.sleep(5000);
        act.dragAndDropBy(e1, -400,0).perform(); //right to left
        Thread.sleep(5000);
        driver.switchTo().defaultContent(); //back to page
        Thread.sleep(5000);
        //verticall slider
        driver.findElement(By.linkText("Vertical slider")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0); //switch to frame
        WebElement e2=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
        act.dragAndDropBy(e2,0,100).perform(); //top to bottom
        Thread.sleep(5000);
        act.dragAndDropBy(e2,0,-50).perform(); //bottom to top
        Thread.sleep(5000);
        driver.switchTo().defaultContent();//back to page
        //close site 
        driver.close();
        
        
	}

}
