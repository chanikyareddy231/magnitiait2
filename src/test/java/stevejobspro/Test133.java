package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test133 {

	public static void main(String[] args) 
	{
		//open browser 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //lanch site
        driver.get("https://www.google.co.in");
        //Do some operations
        //--------
        //-----
        driver.executeScript("history.go(0);");
	}

}
