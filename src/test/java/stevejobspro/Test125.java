package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test125 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stackoverflow.com/questions/38653910/actions-click-script-selenium");
        Thread.sleep(5000);
        Actions a=new Actions(driver);
        WebElement e1=driver.findElement(By.linkText("Contact Us")); //at end of the page
        a.moveToElement(e1).perform();
        Thread.sleep(5000);
        WebElement e2=driver.findElement(By.partialLinkText("Ask Question")); //at top of the page
        a.moveToElement(e2).perform();
	}
}
