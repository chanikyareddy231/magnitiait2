package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test137 {

	@Test
	public void method() throws Exception
	{
		//Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String num=sc.nextLine();
		sc.close();
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rangeslider.js.org");
        Thread.sleep(5000);
        //locate Range slider and operate to specific value(javaScript with jquery)
        WebElement slider=driver.findElement(By.cssSelector("input[type='range']"));
        driver.executeScript("$(arguments[0]).val("+num+").change()",slider);
	}

}
