package seleniumlearn;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WndowHandles {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String baselink = "https://omayo.blogspot.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baselink);
		driver.manage().window().maximize();
		WebElement newWindow = driver.findElement(By.xpath("//*[@id=\"HTML37\"]/div[1]/p/a"));
		newWindow.click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator i = windowHandles.iterator();
		i.next();
		String childwindow = (String) i.next();
		driver.switchTo().window(childwindow);
		WebElement child = driver.findElement(By.xpath("//*[@id=\"para1\"]"));
		String text = child.getText();
		System.out.println(text);
	}

}
