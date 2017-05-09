
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	static void testLogin() throws AWTException, InterruptedException{
		//1. open the browser
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement loginPage = driver.findElement(By.xpath(".//*[@id='content']/ul/li[2]/a"));
		loginPage.click();
		Thread.sleep(5000);
		//go to pop up window
		String parentWindowHandler = driver.getWindowHandle();
		String childWindowHandler = null;
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iter = handles.iterator();
		Thread.sleep(5000);
		while (iter.hasNext()){
			childWindowHandler = iter.next();
		}
		driver.switchTo().window(childWindowHandler);
		System.out.println(parentWindowHandler);
		System.out.println(childWindowHandler);
		//type in pop up window
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);        
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_N);
		r.delay(5000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);        
		r.keyRelease(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_N);
		r.delay(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		testLogin();
	}

}
