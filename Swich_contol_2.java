package selenium.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Swich_contol_2 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(10000);
driver.manage().window().maximize();
WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
search.sendKeys("shoes");
search.sendKeys(Keys.ENTER);
WebElement cross=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
cross.click();
String parent_id=driver.getWindowHandle();
Set<String> par_chi_id=driver.getWindowHandles();
System.out.println(parent_id);
System.out.println(par_chi_id);
Iterator<String> pc_id=par_chi_id.iterator();
String par_id=pc_id.next();
String chidd_id=pc_id.next();

driver.switchTo().window(chidd_id);
Thread.sleep(3000);
//driver.close();
WebElement a=driver.findElement(By.id("add-to-cart-button"));
a.click();
driver.close();

	}

}
