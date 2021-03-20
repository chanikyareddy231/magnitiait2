package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test156
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
								By.xpath("//input[@placeholder='add new todo here']"))).sendKeys(x);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='add']"))).click();
		try
		{
			//Locate dynamic element using dynamic information(parameterize xpath)
			w.until(ExpectedConditions.elementToBeClickable(
									By.xpath("//label[@class='checkbox']/span[text()='"+x+"']"))).click();
			System.out.println("test passed");
		}
		catch(Exception ex)
		{
			System.out.println("Test failed Due to "+ex.getMessage());
		}
		//close site
        driver.close();
	}

}
