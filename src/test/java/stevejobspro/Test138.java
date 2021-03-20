package stevejobspro;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test138 {

	public static void main(String[] args) 
	{
		//open browser and launch site
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        long start=System.currentTimeMillis();
        driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
        while(true)
        {
        	String res=(String) driver.executeScript("return(document.readystate)");
        	if(res.equals("Complete"))
        	{
        		break; //terminate from loop
        	}
        }
        long end=System.currentTimeMillis();
        System.out.println("page load time is"+(end-start));
        //close site
        driver.close();
	}

}
