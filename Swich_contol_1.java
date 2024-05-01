package selenium.program;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swich_contol_1 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI1PfblviAhQMVC6hmAh1CTAjqEAAYASAAEgJN9_D_BwE&gclsrc=aw.ds");
driver.manage().window().maximize();
WebElement google_link=driver.findElement(By.xpath("//span[.='Google']"));
google_link.click();
String parent_id=driver.getWindowHandle();
Set<String> parent_child_id=driver.getWindowHandles();
System.out.println(parent_id);
System.out.println(parent_child_id);
//driver.close();
//WebElement check=driver.findElement(By.id("identifierId"));
//check.sendKeys("ahjadAJHD@gmail.com");it will give NoSuchElementException bcz such elemenets are not there
Iterator<String> pc_id=parent_child_id.iterator();
String parent1_id=pc_id.next();//it will give paent id from parent_child_id
String child1_id=pc_id.next();// it will give 1st child of parent_child_id

System.out.println(parent1_id);
System.out.println(child1_id);
driver.switchTo().window(child1_id);// now control moved to child window
Thread.sleep(5000);
driver.close();//now child tab will close means control moved to child tab
	}

}
