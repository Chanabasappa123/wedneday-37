package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Correct_x_path_2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.xpath("//nav[@class='tree-nav default']/ul/li/span"));
		w1.click();
		//driver.close();
		
	}

}
