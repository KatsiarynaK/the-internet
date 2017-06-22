import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class Dropdown {

	WebDriver driver;
	WebDriverWait wait;
	
	
		// TODO Auto-generated method stub
		
		
		@Before
		public void setUpDriver() throws Exception{
			System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#content > ul li:nth-child(9) a")));
		}
		@Test
		public void dropDownTest() throws Exception{
			WebElement dropdownPage = driver.findElement(By.cssSelector("div#content > ul li:nth-child(9) a"));
			dropdownPage.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#dropdown")));
			
			Select dropDown = new Select(driver.findElement(By.cssSelector("#dropdown")));
			dropDown.deselectByVisibleText("Option 1");
			
			/*
			WebElement dropDownList = driver.findElement(By.cssSelector("#dropdown"));
			
			List<WebElement> allOptions = dropDownList.findElements(By.tagName("option"));
			for (WebElement option: allOptions){
				if (option.getText().equalsIgnoreCase("Option 1")){
					option.click();
				}
			}
			String selectedOpt = "";
			for (int i = 0; i < allOptions.size(); i++){
				if (allOptions.get(i).isSelected()){
					selectedOpt = allOptions.get(i).getText();
				}
			}
			assertThat(selectedOpt, is("Option 1"));
			
			*/
		}
		/*
		@After
		public void teatDownDriver() throws Exception{
			driver.quit();
		}
		*/
		
	

}
