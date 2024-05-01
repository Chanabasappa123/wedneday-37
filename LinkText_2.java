
// Assignment  114:Launch Amazon and click on mobile tab.
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_2 {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.linkText("United Arab Emirates")).click();

	}

}
