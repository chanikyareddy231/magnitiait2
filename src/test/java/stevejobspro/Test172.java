package stevejobspro;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test172 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		HashMap<String,Object> params=new HashMap<String,Object>();
		params.put("latitude",26.1248239);
		params.put("longitude",-80.2655737); //Florida
		params.put("accuracy",1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride",params);
		//Launch site
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kalam",Keys.ENTER);

	}

}
