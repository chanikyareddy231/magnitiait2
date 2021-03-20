package stevejobspro;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v87.network.Network;
import org.openqa.selenium.devtools.v87.network.model.ConnectionType;

import com.google.common.collect.ImmutableList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test166
{

	public static void main(String[] args) 
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Create DevTools session
		DevTools dt=driver.getDevTools();
		dt.createSession();
		//Set blocked URL patterns
		Command cmd1=Network.enable(Optional.empty(),Optional.empty(),Optional.empty());
		Command cmd2=Network.setBlockedURLs(ImmutableList.of("*.css","*.png","*.gif"));
		dt.send(cmd1);
		dt.send(cmd2);
		//Launch site
		driver.get("http://www.redbus.in");
		//close site
		//driver.close();

	}

}
