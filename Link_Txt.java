package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Link_Txt {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
List<WebElement> Links=driver.findElements(By.tagName("a"));
int num=Links.size();
System.out.println("Number of links "+
num);
for (int i=0;i<+num-1;i++)
{
	WebElement a=Links.get(i);
	String url=a.getText();
	System.out.println(url);
	}
driver.quit();
	}

}
