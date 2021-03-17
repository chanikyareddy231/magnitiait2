package stevejobspro;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test178 {

	public static void main(String[] args) 
	{
		//Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("User id");
		String uid=sc.nextLine();
		System.out.println("Password");
		String pwd=sc.nextLine();
		sc.close();
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site using URL(SWD)
		driver.get("http://"+uid+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
		//continue page automation

	}

}
