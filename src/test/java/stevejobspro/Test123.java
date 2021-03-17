package stevejobspro;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item like Installation/Manufacturing/Sales/Project Development/Other");
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
        WebElement b=driver.findElement(By.xpath("//button[starts-with(@aria-label,'Hide "+item+"')]"));
        Actions a=new Actions(driver);
        a.moveToElement(b).perform();
        Thread.sleep(5000);
        //collect all paths in graphs and take opacity values of those paths
        List<WebElement> paths=driver.findElements(By.xpath("//*[name()='svg']//*[name='g' and @class='highcharts-series-group']"
        										+ "//*[name()='g' and @aria-hidden='false']")); 
        String temp1=paths.get(0).getAttribute("opacity");
        float o1=Float.parseFloat(temp1);
        String temp2=paths.get(1).getAttribute("opacity");
        float o2=Float.parseFloat(temp2);
        String temp3=paths.get(2).getAttribute("opacity");
        float o3=Float.parseFloat(temp3);
        String temp4=paths.get(3).getAttribute("opacity");
        float o4=Float.parseFloat(temp4);
        String temp5=paths.get(4).getAttribute("opacity");
        float o5=Float.parseFloat(temp5);
        //validation
        if(item.equals("Installation") && o1==1 && o2<1 && o3<1 && o4<1 && o5<1)
        {
        	System.out.println("Test passed");
        }
        else if(item.equals("Manufacturing") && o1<1 && o2==1 && o3<1 && o4<1 && o5<1)
        {
        	System.out.println("Test passed");
        }   
        else if(item.equals("sales") && o1<1 && o2<1 && o3==1 && o4<1 && o5<1)
        {
        	System.out.println("Test passed");
        }   
        else if(item.equals("Project Development") && o1<1 && o2<1 && o3<1 && o4==1 && o5<1)
        {
        	System.out.println("Other");
        }   
        else if(item.equals("Installation") && o1<1 && o2<1 && o3<1 && o4<1 && o5==1)
        {
        	System.out.println("Test passed");
        }   
        else
        {
        	System.out.println("Test failed");
        }
        //close site
        driver.close();
	}

}
