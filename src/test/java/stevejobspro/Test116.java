package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test116 {

	public static void main(String[] args) throws Exception
	{	
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].disabled=true;",e);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disabled=false;",e);
		Thread.sleep(5000);
		//change-3:Remove an element
		WebElement e1=driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
		driver.executeScript("arguments[0].remove();",e1);
		Thread.sleep(5000);
		//change-4:add new plain text
		WebElement e2=driver.findElement(By.id("searchform"));
		driver.executeScript("var para=document.createElement('p');" 
				+ "var node=document.createTextNode('This is Batch 251');"
				+ "para.appendChild(node);"
				+"arguments[0].appendChild(para);", e2);
		Thread.sleep(5000);
	}

}
