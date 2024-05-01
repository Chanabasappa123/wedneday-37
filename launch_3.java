package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		//driver.findElement(By.id("Username"));//it will find the element and located the element
		driver.findElement(By.id("Username")).sendKeys("chandru123");//sendKeys method  used to type something in selenium 
		
	}

}
