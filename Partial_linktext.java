//Assignment  117:Launch (JSAM) HTML page get elements by xpath(absolute xpath)

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linktext {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
//driver.get("file:///C:/Users/l/Downloads/learningHTML1.html");
//driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("manish123");
driver.manage().window().maximize();
driver.get("file:///C:/Users/l/Downloads/learningHTML1.html");
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Chanabasappa");
driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hubballi boy");
driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Hubli123");
driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Chanabasappa");
//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
driver.findElement(By.xpath("(/html/body/form)[2]/input[2]")).click();
//driver.findElement(By.xpath("(/html/body/form)[2]/input[4]")).click();
driver.findElement(By.xpath("(/html/body/input)[4]")).click();
driver.findElement(By.xpath("(/html/body/input)[6]")).click();
//driver.findElement(By.xpath("(/html/body/a)[1]")).click();
driver.findElement(By.xpath("(/html/body/select)[1]")).click();
driver.findElement(By.xpath("(/html/body/input)[7]")).click();
driver.findElement(By.xpath("(/html/body/img)[1]")).click();

//driver.close();
	}

}
