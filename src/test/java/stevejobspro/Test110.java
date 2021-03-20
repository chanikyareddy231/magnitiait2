package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test110 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		//locate elements for drag and dop
        WebElement e1=driver.findElement(By.id("draggable"));
        WebElement e2=driver.findElement(By.id("droppable"));
        //perform draganddrop 
        Actions act=new Actions(driver);
        act.dragAndDrop(e1,e2).perform();;
        Thread.sleep(5000);
        //close site 
        driver.close();
	}

}
