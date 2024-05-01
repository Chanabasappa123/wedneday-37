package selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_1 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();

WebElement skills=driver.findElement(By.id("Skills"));
Select s1=new Select(skills);
s1.selectByVisibleText("Technical Skills");
List<WebElement> count=s1.getOptions();
int check=count.size();
System.out.println(check);

WebElement second_dd=driver.findElement(By.id("Country"));
Select s2=new Select(second_dd);
s2.selectByValue("India");
List<WebElement> count_1=s2.getOptions();
System.out.println(count_1.size());

WebElement third_dd=driver.findElement(By.id("Relegion"));
Select s3=new Select(third_dd);
s3.selectByValue("Hindu");
List<WebElement> count_2=s3.getOptions();
System.out.println(count_2.size());


	}

}
