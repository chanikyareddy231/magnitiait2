package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test135 {

	public static void main(String[] args) throws Exception
	{
		//open browser 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //lanch site and locate an image to test immediatly
        driver.get("https://users.cs.cf.ac.uk/Dave.Marshall/Internet/FRAMES/nested_frame.html");
        Thread.sleep(5000);
        long n=(long) driver.executeScript("return(window.frames.length);");
        System.out.println(n);
        driver.executeScript("var frames=window.frames; "+
                              "frames[3].location='https://www.bbc.com';");
        //close site
        //driver.close();

	}

}
