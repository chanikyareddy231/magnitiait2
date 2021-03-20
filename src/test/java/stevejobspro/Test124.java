package stevejobspro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test124 {

	@Test
	public void method() throws Exception
	{
		//Take a word from keyboard
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to be searched");
        String x=sc.nextLine();
        System.out.println("Enter a word to be Target");
        String y=sc.nextLine();
        sc.close();
        //open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.co.in");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
        Thread.sleep(5000);
        //pagination on result pages
        int currentpageindex=1;
        int total=0;
        while(true) //infinite loop
        {
        	try
        	{
        		//get content (inner text) in current page(using javascript)
        		String z=(String) driver.executeScript("return(document.documentElement.innerText);");
        		//serch for target word in that content using regularexpressions
        		Pattern p=Pattern.compile(y,Pattern.CASE_INSENSITIVE);
        		Matcher m=p.matcher(z);
        		int noow=0;
        		while(m.find())
        		{
        			noow++;
        		}
        		total=total+noow;
        		//Display page
        		if(currentpageindex==1)
        		{
        			System.out.println(currentpageindex+ "st page consists of "+noow);
        		}
        		else if(currentpageindex==2)
        		{
        			System.out.println(currentpageindex+ "nd page consists of "+noow);
        		}	
        		else if(currentpageindex==3)
        		{
        			System.out.println(currentpageindex+ "rd page consists of "+noow);
        		}	
        		else 
        		{
        			System.out.println(currentpageindex+ "th page consists of "+noow);
        		}	
        		//Go to next page if exsits
        		driver.findElement(By.xpath("//a[text()='"+(currentpageindex+1)+"']")).click();
        		Thread.sleep(2000);
        		currentpageindex++;
        	}
        	catch(NoSuchElementException ex)
        	{
        		break; //terminate from loop
        	}
        }
        	System.out.println("Toatal count of results is "+total);
        	//close site
            driver.close();
	}

}
