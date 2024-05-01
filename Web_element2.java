 //Assignment 121:Launch GrowTechminds registration form,locate every element except Dropdowns and Upload file button and perform action on each element using WebElement

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element2 {

	public static void main(String[] args) {
	ChromeDriver	driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	
	WebElement Enteremail=driver.findElement(By.id("email"));
	Enteremail.sendKeys("channusangalad@gmail.com");
	
	WebElement Enterpass=driver.findElement(By.name("password"));
	Enterpass.sendKeys("channnu@123");
	
	WebElement Entergender=driver.findElement(By.id("male"));
	Entergender.sendKeys(Keys.ENTER);
	
	 WebElement Enterpresentadd=driver.findElement(By.id("Present-Address"));
	 Enterpresentadd.sendKeys("Hubli,karnataka");
	 
	 WebElement Enterpermanentadd=driver.findElement(By.id("Permanent-Address"));
	 Enterpermanentadd.sendKeys("Dharwad,kundagol");
	 
	 WebElement Enterpincode=driver.findElement(By.id("Pincode"));
	 Enterpincode.sendKeys("581117");
	 
	 WebElement Enterlocate=driver.findElement(By.name("relocate"));
	 Enterlocate.click();
	 
	 WebElement Entersubmit=driver.findElement(By.className("btn btn-primary"));
	 Entersubmit.sendKeys(Keys.ENTER); 
	}
}
