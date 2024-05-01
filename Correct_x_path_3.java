package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Correct_x_path_3 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/x-path/#1");
driver.manage().window().maximize();
WebElement  w1 =driver.findElement(By.xpath("//span[@class='folder']"));
w1.click();
WebElement  w2 =driver.findElement(By.xpath("//span[@class='folder']"));
w2.click();
WebElement  w3 =driver.findElement(By.xpath("(//span[@class='folder'])[15]"));
w3.click();
WebElement  w4 =driver.findElement(By.xpath("(//span[@class='folder'])[24]"));
w4.click();
WebElement  w5 =driver.findElement(By.xpath("(//span[@class='folder'])[33]"));
w5.click();
	}

}
