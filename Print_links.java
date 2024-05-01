package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Print_links {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
  List<WebElement>  links=driver.findElements(By.tagName("a"));
  int num=links.size();
  System.out.println(num);
  for(int i=0;i<=num-1;i++)
  {
	WebElement a=links.get(i) ;
	String url=a.getAttribute("href");
	System.out.println(url);
  }
  }
	}
