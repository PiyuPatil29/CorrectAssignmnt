package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplefruitDemo {
	static WebDriver driver;

	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice\r\n");
		driver.manage().window().maximize();

		List<WebElement> option = driver
				.findElements(By.xpath("//*[@id=\"block-1069048\"]/div/div/div/div[1]/div[3]/fieldset/select"));

		int size = option.size();
		for (int i = 0; i < size; i++) {
			String options = option.get(i).getText();
		//	System.out.println(options);
			Assert.assertTrue(options.equalsIgnoreCase(options));
			System.out.println(options);
			// without select we have to check wheather wrong list is displayed
		}

	}

}
