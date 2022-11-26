package seleniumlearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String BaseLink = "https://omayo.blogspot.com/";
		driver.get(BaseLink);
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"drop1\"]"));
		Select choice = new Select(dropdown);
		choice.selectByIndex(3);
	}
}
