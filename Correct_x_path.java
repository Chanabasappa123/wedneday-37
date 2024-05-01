// Correct way to write X path
// Launch amazon india search for shoes and click on the search button
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Correct_x_path {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
