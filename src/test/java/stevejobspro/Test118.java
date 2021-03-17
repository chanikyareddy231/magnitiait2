package stevejobspro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test118 {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in");
		Thread.sleep(10000);
		//get details of radio button(psuedo element "::before") before select
		String bc1=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ "var pe=window.getComputedStyle(ne,'::before');"
				+ "var x=pe.getPropertyValue('border-color');"
				+ "return(x);");
		String bgc1=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ "var pe=window.getComputedStyle(ne,'::before');"
				+ "var x=pe.getPropertyValue('background-color');"
				+ "return(x);");
		System.out.println(bc1+" "+bgc1);
		//select a radio button(pseudo element)by clicking
		WebElement e=driver.findElement(By.xpath("//label[@for='roundTrip']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).moveByOffset(-50,0).click().build().perform();
		Thread.sleep(5000);
		//get details of radio button(psuedo element "::before") after select
		String bc2=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ "var pe=window.getComputedStyle(ne,'::before');"
				+ "var x=pe.getPropertyValue('border-color');"
				+ "return(x);");
		String bgc2=(String) driver.executeScript("var ne=document.querySelector('label[for=roundTrip]');"
				+ "var pe=window.getComputedStyle(ne,'::before');"
				+ "var x=pe.getPropertyValue('background-color');"
				+ "return(x);");
		System.out.println(bc2+" "+bgc2);
		//close site
		driver.close();
	}

}
