package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/l/Downloads/learningHTML1.html");
driver.manage().window().maximize();
driver.findElement(By.tagName("a")).click();


	}

}
