
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	static void testLogin(){
		//1. open the browser
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement loginPage = driver.findElement(By.xpath(".//*[@id='content']/ul/li[2]/a"));
		loginPage.click();
		//go to pop up window
		String parentWindowHandler = driver.getWindowHandle();
		String childWindowHandler = null;
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iter = handles.iterator();
		while (iter.hasNext()){
			childWindowHandler = iter.next();
		}
		driver.switchTo().window(childWindowHandler);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLogin();
	}

}
