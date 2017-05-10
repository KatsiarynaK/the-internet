import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://Soft_installed//eclipse//workspace//the-internet//geckodriver-v0.15.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(5000);
		// change!!!!
		WebElement link = driver.findElement(By.id(".//*[@id='content']/ul/li[5]/a"));
		link.click();
	}

}
