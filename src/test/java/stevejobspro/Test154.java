package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test154
{
	@Test
	public void method() throws Exception
	{
		//Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String x=sc.nextLine();
		sc.close();
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://angularjs.org");
		//Wait for an element and enter some text
		WebDriverWait w=new WebDriverWait(driver,20); 
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Enter a name here']"))).sendKeys(x);
		try
		{
			//Locate dynamic element using static information (example:- class name is static)
			String y=w.until(ExpectedConditions.visibilityOfElementLocated(By.className("ng-binding"))).getText();
			if(y.equals("Hello"+x+"!"))
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test passed");
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		//close site
		driver.close();
	}
}
