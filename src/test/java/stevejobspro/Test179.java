package stevejobspro;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test179 {

	public static void main(String[] args) throws Exception
	{
		//open Browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//lunch site under testing(SUT)
		driver.get("http://www.gmail.com");
		WebDriverWait w=new WebDriverWait(driver,20);
		//locate and fill userid
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))).sendKeys("chanikyareddy231");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']/child::div[2]"))).click();
		//locate and fill password
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Chanikya231");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='passwordNext']/descendant::div[3]"))).click();
	    //locate and click on compose button
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@gh='cm']"))).click();
	    //fill fields
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to"))).sendKeys("chinnapureddymahesh55555@gmail.com");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("subjectbox"))).sendKeys("wishes");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Message Body']"))).sendKeys("hi mahesh,\nkeep smile");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@aria-label='Attach files']/div/div/div"))).click();
		Thread.sleep(10000);
		String x="C:\\images\\3 d image for background.jpg";
		Thread.sleep(2000);
		StringSelection y=new StringSelection(x);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(10000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		Thread.sleep(3000);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[starts-with(@aria-label,'Uploading')]")));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[starts-with(@data-tooltip,'Send')]"))).click();
		Thread.sleep(5000);
	    String op=w.until(ExpectedConditions.elementToBeClickable( By.xpath("//*[@class='vh']/span"))).getText();
	    System.out.println(op);
	    //do logout
	    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[starts-with(@aria-label,'Google Account')]/child::*"))).click();
	    w.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out"))).click();
	    //close site
	    driver.close();
	}

}
