package stevejobspro;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test122 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item like Installation/Manufacturing/sales/Project Development/Other");
		String item=sc.nextLine();
		sc.close();
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.highcharts.com/demo/line-basic");
		Thread.sleep(5000);
		try
		{
		driver.findElement(By.partialLinkText("Use necessary cookies only")).click();
		}
		catch (Exception ex)
		{
			System.out.println("No banner");
		}
		//Locate "svg"  (Scalable 	Vector Graphics) element(SWD)
        WebElement e=driver.findElement(By.xpath("//*[name()='svg']"));
        driver.executeScript("arguments[0].scrollIntoView();",e);
        Thread.sleep(5000);
        //LOcate child elements in graph(SWD)
        List<WebElement> points=driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and contains(@aria-label,'"+item+"')]"
        								+ "//*[name()='path' and @role='img']"));
        System.out.println(points.size());
        for(int i=0;i<points.size();i++)
        {
        	//Get info using (Java Script)
        	String o=(String) driver.executeScript("return(arguments[0].getAttribute('aria-label'));",points.get(i));
        	String[] p=o.split(" ");
        	String year=p[2].replace(",","");
        	String value=p[3].replace(".","").replace(",","");
        	System.out.println(year+"<=>"+value);
        }
        //close site
        driver.close();
	
	}

}
