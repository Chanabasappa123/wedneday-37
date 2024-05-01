package selenium.program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_popup {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/l/Downloads/learningHTML1.html");
driver.switchTo().alert().accept();// must be  written before maximize bcz it will not allow to do any  action
driver.manage().window().maximize();
WebElement a=driver.findElement(By.id("1"));
a.sendKeys("chanabsdr");
Thread.sleep(5000);
driver.close();
	}

}
