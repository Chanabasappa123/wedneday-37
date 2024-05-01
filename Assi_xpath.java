package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi_xpath {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sangaladchandru@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("chandru@123");
driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
