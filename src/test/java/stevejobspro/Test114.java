package stevejobspro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test114 {

	@Test
	public void method() throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//locate Element using SWD-JAVA and operate element using JAVASCRIPT
		WebElement e1=driver.findElement(By.name("identifier"));
		WebElement e2=driver.findElement(By.xpath("//button[@type='button']/child::div[2]"));
		Thread.sleep(5000);
		driver.executeScript("arguments[0].value='chanikyareddy231';",e1);  //fill
		driver.executeScript("arguments[0].click();",e2);
		Thread.sleep(5000);
		//Locate element and operate element both using JAVAScript only
		driver.executeScript("document.getElementsByName('password')[0].value='Chanikya231';");
		driver.executeScript("document.getElementsByTagName('button')[1].click();");
		// 2nd button is "n=Next" element,so index is 1.	
	}
}
