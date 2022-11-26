package seleniumlearn;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	private static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String baselink = "https://omayo.blogspot.com/";
		driver.get(baselink);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.xpath("//*[@id=\"alert1\"]"));
		we.click();
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(3000);// Just for demonstration
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = alert.getText();
		alert.accept();

		System.out.println(text);

	}
}
