import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content > ul li:nth-child(9) a")));
		WebElement dropdownPage = driver.findElement(By.cssSelector("div#content > ul li:nth-child(9) a"));
		dropdownPage.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#dropdown")));
		WebElement dropd = driver.findElement(By.cssSelector("#dropdown"));
		dropd.click();
		Select droplist = new Select(dropd);
		System.out.println("droplist selected");
		List<WebElement> allOptions = droplist.getOptions();
		for (WebElement option: allOptions){
			if (option.getText().equalsIgnoreCase("Option 1")){
				option.click();
			}
		}
		
		
	}

}
