package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test139 {

	public static void main(String[] args)throws Exception
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rangeslider.js.org");
        Thread.sleep(5000);
        driver.executeScript("window.location='https://www.facebook.com';");
        

	}

}
