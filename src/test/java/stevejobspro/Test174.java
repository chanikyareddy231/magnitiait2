package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test174 {

	@Test
	public void method() throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		MyListenerBodies obj1=new MyListenerBodies();
		edriver.register(obj1);
		//Automation
		WebDriverWait w=new WebDriverWait(driver,20);
		edriver.manage().window().maximize();
		//Launch site
		edriver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		edriver.switchTo().frame("iframeResult");
		WebElement e=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Try it']")));
		e.click();
		edriver.switchTo().alert().accept();
		edriver.switchTo().defaultContent();
		edriver.unregister(obj1);
		//close site
		driver.close();
		
		
		
		
	}

}
