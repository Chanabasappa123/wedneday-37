//Kyes_Function
//Assignment  118:Login to facebook.com - write email and copy paste same in password
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Keys_fun1 {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chandra@gmail.com");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.CONTROL+"a");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.CONTROL+"c");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Keys.CONTROL+"v");
driver.findElement(By.name("login")).click();

	}

}
