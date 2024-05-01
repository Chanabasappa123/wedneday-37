//Launch Google and type India and select the 4th option 
package selenium.program;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.name("q"));
e1.sendKeys("INDIA");
Thread.sleep(1000);
List<WebElement> result=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));//xpah for 1st autosuggestion
int counting_auto=result.size();
System.out.println(counting_auto);// prints how many autosuggestios are present
Thread.sleep(3000);
//result.get(3).click();
result.get(counting_auto-7).click();//generic way to select autosugggestion
	}
}
