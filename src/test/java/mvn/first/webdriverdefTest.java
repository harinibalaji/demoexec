package mvn.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdefTest {
	
	public static WebDriver driver = null;
	
	public webdriverdefTest() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

	public static WebDriver getdriver() {
		if (driver == null) {

			return driver;
		} else {
			return driver;
		}
	}


}
