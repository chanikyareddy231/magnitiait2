package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test155
{
	public static void main(String[] args) 
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
		w.until(ExpectedConditions.elementToBeClickable(
				           By.xpath("//*[@placeholder='Enter a name here']"))).sendKeys(x); //input element
		//Wait for output and test
		try
		{
			//Locate dynamic element using static information (example:- class name is static)
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Hello "+x+"!']")));
			System.out.println("Test passed");		
		}
		catch (Exception ex)
		{
			System.out.println("Test failed due to "+ex.getMessage());
		}
		//close site
		driver.close();
	}
}
