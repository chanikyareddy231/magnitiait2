package stevejobspro;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

import com.sun.glass.events.KeyEvent;

public class Test176 {

	public static void main(String[] args) throws Exception 
	{
		//Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1");
		String ip1=sc.nextLine();
		System.out.println("Enter input2");
		String ip2=sc.nextLine();
		sc.close();
		Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
		Thread.sleep(5000);
		//Send input1
		StringSelection x=new StringSelection(ip1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		//Click plus
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		//Send input2
		Thread.sleep(2000);
		StringSelection y=new StringSelection(ip2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		//Click equals
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(2000);
		//Get output
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(z);
		//Close calculator window
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);	
		Thread.sleep(2000);
		//validation
		int i1=Integer.parseInt(ip1);
		int i2=Integer.parseInt(ip2);
		int i3=Integer.parseInt(z);
		Thread.sleep(2000);
		if(i3==i1+i2)
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}	
	}
}
