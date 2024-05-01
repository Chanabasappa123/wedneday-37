package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream f1=new FileInputStream("C:\\Users\\l\\eclipse-workspace\\selenium\\Excel_2\\amz.xlxs.xlsx");
Workbook wb=WorkbookFactory.create(f1);
String us=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
String psd=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//System.out.println(us);
//System.out.println(psw);

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement w1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
w1.click();


WebElement w2=driver.findElement(By.id("ap_email"));
w2.sendKeys(us);
driver.findElement(By.id("continue")).click();

WebElement w5=driver.findElement(By.name("password"));
w5.sendKeys(psd);
driver.findElement(By.id("signInSubmit")).click();

	}

}
