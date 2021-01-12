package assignment2;

//3.Use below link:
//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test
//Identify td element showing Savings of month February,retrieve the savings value and print on console

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonthvalueDemo {
	static WebDriver driver;

	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test");

		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		int rownum = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("rows:" + rownum);

		int column = driver.findElements(By.xpath("//th[contains(text(),'Month')]")).size();
		System.out.println("columns:" + column);

		WebElement table = driver.findElement(By.xpath("/html/body/table"));

		WebElement rowval = table.findElement(By.xpath("/html/body/table/tbody//child::tr//following-sibling::td[contains(text(),'February')]"));

		String rowTextMonth = rowval.getText();
		System.out.println("Rowtext of Month is " +rowTextMonth);
	
	
	
		WebElement value = table.findElement(By.xpath("//td[contains(text(),'$80')]"));
		String textSaving = value.getText();
		System.out.println("Rowtext is " + textSaving);

	}

}
