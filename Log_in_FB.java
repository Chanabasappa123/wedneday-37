// assignment 112:Login to Facebook using id,name locator

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in_FB {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();// It will maximize your browser
driver.findElement(By.id("email")).sendKeys("channusangalad@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Basu@123");
driver.findElement(By.name("login")).click();
	}

}
