package stevejobspro;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test103 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//Get screen shot of page
		File f1=driver.getScreenshotAs(OutputType.FILE);
		File dest1=new File("pagescreenshot.png");
		FileHandler.copy(f1,dest1);
		//Get screen shot of element
		WebElement e=driver.findElement(By.xpath("//h4[text()='Inline']/following-sibling::span/div"));
		File f2=e.getScreenshotAs(OutputType.FILE);
		File dest2=new File("elementscreenshot.png");
		FileHandler.copy(f2,dest2);
		//close site
		driver.close();

	}

}
