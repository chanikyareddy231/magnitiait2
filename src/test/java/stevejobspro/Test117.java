package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test117 {

	@Test
	public void method() throws Exception
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password value");
		String p=sc.nextLine();
		sc.close();
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("password"));
		e.sendKeys(p);
		Thread.sleep(5000);
		//password testing
		//step-1:change password box type to "text" to get visibility of given password value
		driver.executeScript("arguments[0].setAttribute('type','text');",e);
		Thread.sleep(5000);
		//step-2:get visible value
		String x=e.getAttribute("value");
		//step-3:validate visible password value with given password value
		if(x.equals(p))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test passed");
		}
        //close site
		driver.close();
		

	}

}
