package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test143 {

	@Test
	public void method() throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		//max wait in 20sec,but default interval time
		WebDriverWait w=new WebDriverWait(driver,20);
		try
		{
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept Cookies']"))).click();			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		//Dafine wait condition for calander
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'RadCalendar')]")));
		WebElement e=driver.findElement(By.xpath("//*[contains(@class,'RadCalendar')]"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		//wait,locate and click on a day link
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("22"))).click();
		//Define wait condition for invisibility of loader(spinner)icon
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//close site
		driver.close();
	}

}
