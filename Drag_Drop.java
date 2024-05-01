package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/drag-and-drop/");
driver.manage().window().maximize();

WebElement drag=driver.findElement(By.id("drag1"));

WebElement drop=driver.findElement(By.id("div2"));
Actions a1=new Actions(driver);
a1.dragAndDrop(drag, drop).perform();


Thread.sleep(5000);
// TO revert the same use below code:

WebElement drag_1=driver.findElement(By.id("drag1"));
WebElement drop_1=driver.findElement(By.id("div1"));

a1.dragAndDrop(drag_1,drop_1).perform();



	}

}
