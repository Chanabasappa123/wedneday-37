package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement fshion=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
Actions a1=new Actions(driver);
a1.moveToElement(fshion).perform();
WebElement shirts=driver.findElement(By.className("_3490ry"));
shirts.click();
System.out.println(driver.getTitle());
}
	}
