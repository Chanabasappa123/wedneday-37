package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Classname_1 {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.className("gLFyf")).sendKeys("INDIA");
driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);



	}

}
