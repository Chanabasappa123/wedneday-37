package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_2 {

	public static void main(String[] args)  {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		//driver.close();// it will close parent browser
		//driver.quit();// it will close both parent browser and child browser
		System.out.println(driver.getWindowHandle());//it will give always browser id of parent browser
		System.out.println(driver.getWindowHandles());//it will give always browser id of parent browser and child browser
		System.out.println(driver.getTitle());//it will give alwaays title of the website page
	}

}
