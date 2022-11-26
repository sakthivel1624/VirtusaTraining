package seleniumlearn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// Selenium code to perform operations on multiple browsers

		Scanner sc = new Scanner(System.in);
		String driver_choice = sc.next();
		if (driver_choice.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (driver_choice.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (driver_choice.contains("firfox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (driver_choice.contains("internet")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Come again with other Browser......");
		}
		String URL = "https://omayo.blogspot.com/";
		driver.get(URL);
		driver.manage().window().fullscreen();
		sc.close();
	}
}
