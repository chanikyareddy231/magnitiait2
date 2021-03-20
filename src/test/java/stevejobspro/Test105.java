package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test105 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.linkText("Gmail"));
		act.click(e1).perform();
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.partialLinkText("Sign in"));
		act.moveToElement(e2).click().perform();
		Thread.sleep(5000);
		//close site
		driver.quit();
		
				
		

	}

}
