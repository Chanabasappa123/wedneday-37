
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Keys_select1 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("chandru sangalad");
     	//driver.findElement(By.name("email")).sendKeys(Keys.chord(Keys.SHIFT,Keys.ARROW_LEFT,Keys.SHIFT,Keys.ARROW_LEFT,Keys.SHIFT,Keys.ARROW_LEFT,Keys.SHIFT,Keys.ARROW_LEFT,Keys.SHIFT,Keys.ARROW_LEFT,Keys.SHIFT,Keys.ARROW_LEFT));

     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.SHIFT,Keys.ARROW_LEFT);
     	driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"c");
     	driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
     	






		
		
		

	}

}
