package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_popup {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/registration/");
driver.manage().window().maximize();
WebElement a=driver.findElement(By.id("file"));
a.sendKeys("C:\\Users\\l\\Desktop\\Rohan Singh SQL Class.pdf");// path//filename\\extenionn
a.click();
	}

}
