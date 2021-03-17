package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test112 {

	public static void main(String[] args) throws Exception
	{
		//pen browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/css/CSS_tooltip.asp");
		Thread.sleep(5000);
		//Tool-tip is title attribute value for target element
		WebElement e1=driver.findElement(By.linkText("SQL"));
		String x=e1.getAttribute("title");
		System.out.println(x);
		//Tool-tip is child element to target element
		WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'Top')]"));
		Actions a=new Actions(driver);
		a.clickAndHold(e2).perform();
		//a.moveToElement(e2).clickAndHold().build().perform();
		Thread.sleep(5000);
		WebElement tt=e2.findElement(By.xpath("child::span"));
		String y=tt.getText();
		System.out.println(y);
		a.release().perform(); //a.moveToElement(e2).perform();
		//close site
		driver.close();

	}

}
