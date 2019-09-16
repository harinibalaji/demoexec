package mvn.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class callurlTest extends webdriverdefTest {

	@Test
	public void geturl()
	{
		
		getdriver().get("http://google.com");
		getdriver().findElement(By.linkText("Images")).click();
		getdriver().findElement(By.name("q")).sendKeys("parrot");
		getdriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		getdriver().close();
	}
}
