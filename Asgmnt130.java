package SeleniumAssignments_Batch43;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmnt130 {

	public static void main(String[] args) throws InterruptedException {
		// Utilize the methods GetTiltle(), quit(), close(), Getwindowhandles(), manage(), Getwindowhandle(), maximize(), minimize() on the launched browsers.
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Cart")).click();
		String id1=driver.getWindowHandle();
		Set<String> id2=driver.getWindowHandles();
		System.out.println(id1);
		System.out.println(id2);
		
		Thread.sleep(2000);
		driver.quit();
		//driver.close();

	}

}
