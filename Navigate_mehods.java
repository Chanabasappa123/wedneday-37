package selenium.program;

import org.openqa.selenium.edge.EdgeDriver;

public class Navigate_mehods {

	public static void main(String[] args) throws InterruptedException {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.navigate().back();// it will naigate to back
Thread.sleep(5000);
driver.navigate().forward();//it  will naigate to back
Thread.sleep(5000);
driver.navigate().refresh(); //it  will refresh the page
Thread.sleep(5000);
driver.navigate().to("https://www.google.co.in/");// another way to lauch URL
	}

}
