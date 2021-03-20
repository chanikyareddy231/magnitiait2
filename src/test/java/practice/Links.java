package practice;

import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links 
{
	public static void main(String[] args) throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("abdul kalam",Keys.ENTER);
		Thread.sleep(5000);
		int clc=0;
		int blc=0;
		while(2>1)
		{
			List<WebElement> l1=driver.findElements(By.xpath("//a |//href |//img |//div"));
			List<WebElement> l2=new ArrayList<WebElement>();
			for(WebElement e:l1)
			{
				try
				{
					if(e.getAttribute("href") != null)
					{
						String x=e.getAttribute("href");
						if(x.startsWith("http") |x.startsWith("https"))
						{
							l2.add(e);
						}
					}
				}
				catch(StaleElementReferenceException ex)
				{
					l1=driver.findElements(By.xpath("//a |//href |//img |//div"));
				}
			}
			for(WebElement e:l2)
			{
				String x=e.getAttribute("href");
				Thread.sleep(5000);
				URL u=new URL(x);
				HttpURLConnection con= (HttpURLConnection) u.openConnection();
				try
				{
					con.connect();
					String y=con.getResponseMessage();
					int z=con.getResponseCode();
					if(y.contains("ok"))
					{
						clc++;
					}
					else
					{
						System.out.println(x+"returns"+y+"with"+z);
						blc++;
					}
					con.disconnect();
				}
				catch(ConnectException ex)
				{
					blc++;
					System.out.println("From"+x+" no responce ");
				}
			}
		}
		
		
		
	}

}
