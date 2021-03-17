package stevejobspro;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test141 
{

	public static void main(String[] args) throws Exception
	{
		//open browser 
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //lanch site and locate an image to test immediatly
        driver.get("https://users.cs.cf.ac.uk/Dave.Marshall/Internet/FRAMES/nested_frame.html");
        Thread.sleep(5000);
        ScriptKey sk1=driver.pin("return(window.frames.length);");
        long n=(long) driver.executeScript(sk1);
        System.out.println(n);
        ScriptKey sk2=driver.pin("var frames=window.frames; ");
        ScriptKey sk3=driver.pin("frames[3].location='https://www.bbc.com';");
        driver.executeScript(sk2);
        driver.executeScript(sk3);
        Set<ScriptKey> l=driver.getPinnedScripts(); //sequential collection
        ArrayList<ScriptKey> al=new ArrayList<ScriptKey>(l); //random collection
        for(ScriptKey a:al)
        {
        	driver.unpin(a);
        }
        //close site
        driver.close();

	}

}
