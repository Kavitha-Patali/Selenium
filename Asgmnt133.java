package SeleniumAssignments_Batch43;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmnt133 {

	public static void main(String[] args) {
		// Launch the facebook application and log in  using name locator
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Kavithapatali@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
	}

}
