package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_2 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();

WebElement rel_gn=driver.findElement(By.id("Relegion"));
Select s1=new Select(rel_gn);
s1.selectByValue("Hindu");
List<WebElement> d1=s1.getOptions();
int count=d1.size();
System.out.println(count);

for(int i=0;i<=count-1;i++)
{
	WebElement a=d1.get(i);
	String s=a.getText();
	System.out.println(s);
}
	}
}
