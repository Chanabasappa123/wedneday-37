package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Web_Element1 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchgoogle =driver.findElement(By.className("gLFyf"));
		searchgoogle.sendKeys("INDIA");
		searchgoogle.sendKeys(Keys.ENTER);

		

	}

}
