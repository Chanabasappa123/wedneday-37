
package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement optiondropdown=driver.findElement(By.id("searchDropdownBox"));
Select s1=new Select(optiondropdown);// creating object select class
//s1.selectByValue("search-alias=stripbooks");
s1.selectByVisibleText("Books");
WebElement searchfld=driver.findElement(By.name("field-keywords"));
searchfld.sendKeys("rhymes");
searchfld.sendKeys(Keys.ENTER);
Thread.sleep(9000);
driver.close();
	}
}
