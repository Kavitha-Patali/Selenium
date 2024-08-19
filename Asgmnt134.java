package SeleniumAssignments_Batch43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmnt134 {

	public static void main(String[] args) {
		// Launch the Amazon ,click on the Sign in button and using name Locator add UserName, Continue and Password 
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("email"));
		un.sendKeys("Kavithapatali@gmail.com");
		
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement pass=driver.findElement(By.id("ap_password"));
		pass.sendKeys("pass");
		
		WebElement signin=driver.findElement(By.id("signInSubmit"));		
		signin.click();
		

	}

}
