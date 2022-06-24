package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1{
	public static <WebDriverManagr> WebDriver OpenBrowser1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // upcasting chromedriver class to webdriver.
		driver.get("https://trade.angelbroking.com/login/");
		return driver;
	}

}
