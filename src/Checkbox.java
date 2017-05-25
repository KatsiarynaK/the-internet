import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;

public class Checkbox {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// CSS locator!!!
		WebElement link = driver.findElement(By.cssSelector("div#content > ul li:nth-child(5) a"));
		link.click();
		//check whether checkbox is already displayed
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("checkboxes")));
		if (isDisplayed(By.id("checkboxes"))){
			System.out.println("Checkboxes are displayed");
		}else{
			System.out.println("WHF??");
			// think what can be done in case of failure to find checkbox!!!
		}
		Assert.assertEquals(isDisplayed(By.id("checkboxes")), true);
	}
	
	public static boolean isDisplayed (By locator){
		try{
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException exeption){
			return false;
		}
	}

}
