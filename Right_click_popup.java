package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Right_click_popup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
	}

}
