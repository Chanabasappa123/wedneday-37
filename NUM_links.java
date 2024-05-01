package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NUM_links {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("Number of linkks present in given webpage" +links.size());
driver.quit();
	}

}
