package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement double_click=driver.findElement(By.linkText("Mobiles"));
Actions a1=new Actions(driver);
a1.doubleClick(double_click).perform();
	}

}
