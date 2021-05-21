package ConfigPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Jars\\Nouveau dossier\\chromedriver.exe");

			driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 600);
			return driver;
	}
}
