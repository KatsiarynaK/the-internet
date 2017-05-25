import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import junit.framework.Assert;

public class Checkbox {

	static WebDriver driver ;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,5);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		// CSS locator!!!
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content > ul li:nth-child(5) a")));
		WebElement link = driver.findElement(By.cssSelector("div#content > ul li:nth-child(5) a"));
		link.click();
		//check whether check-box is already displayed
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("checkboxes")));
		WebElement fCheckbox = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(1)"));
		WebElement sCheckbox = driver.findElement(By.cssSelector("#checkboxes > input:nth-child(3)"));

		if (!fCheckbox.isSelected()){
			System.out.println("first is not selected");
			fCheckbox.click();
		}
		if (!sCheckbox.isSelected()){
			System.out.println("second is not selected");
			sCheckbox.click();
		}
	}
	


}
