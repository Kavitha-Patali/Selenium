package SeleniumAssignments_Batch43;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmnt131 {

	public static void main(String[] args) throws InterruptedException {
		// Launch the google page ,type India and click search using name Locator
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();

	}

}
