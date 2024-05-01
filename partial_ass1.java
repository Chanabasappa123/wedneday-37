// Assignment  116:Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.

package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class partial_ass1 {

    public static void main(String[] args) {
    	EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        String partial_link[] = {"United Arab Emirates", "United Kingdom", "United States"};
        
        for (int i = 0; i < partial_link.length; i++) {
            driver.findElement(By.partialLinkText(partial_link[i])).click();
        }
    }
}
