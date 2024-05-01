package selenium.program;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swich_contol {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.manage().window().maximize();
WebElement google_link=driver.findElement(By.xpath(("//span[.='Google']")));
google_link.click();
String parent_id=driver.getWindowHandle();
Set<String>  pareent_child_id=driver.getWindowHandles();
System.out.println(parent_id);
System.out.println(pareent_child_id);
Thread.sleep(2000);
Iterator<String> pc_id=pareent_child_id.iterator();
String parent_id1=pc_id.next();// parent id from pareent_child_id
String child_id1=pc_id.next();// 1st child id
System.out.println(parent_id1);
System.out.println(child_id1);
 driver.switchTo().window(child_id1);// moved control to the child window
pc_id.next();
//WebElement username=driver.findElement(By.id("identifierId"));
//username.sendKeys("chandr123@gmail.com");
//driver.close();
	}
}
