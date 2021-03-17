package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test152 
{
	public static void main(String[] args) throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.className("hsuHs")); //search
		WebElement target=driver.findElement(RelativeLocator.withTagName("input").toRightOf(e1));
		target.sendKeys("chanikyareddy231");
	}
}
