package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_value_amazon_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\l\\eclipse-workspace\\selenium\\Excelsheet\\chandru_2.xlsx");
		Workbook  wb=WorkbookFactory.create(f1);
		
// we can write everything in one line after opening sheet that is after second step
String str_2=wb.getSheet("amazon_login").getRow(1).getCell(0).getStringCellValue();// fetching username
System.out.println(str_2);

String str_3=wb.getSheet("amazon_login").getRow(1).getCell(1).getStringCellValue();// fetching psd
System.out.println(str_3);

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement log_in=driver.findElement(By.id("nav-link-accountList"));
log_in.click();

WebElement user_name= driver.findElement(By.id("ap_email"));
user_name.sendKeys(str_2);

WebElement press_1= driver.findElement(By.id("continue"));
press_1.click();

WebElement press_2= driver.findElement(By.id("ap_password"));
press_2.sendKeys(str_3);

WebElement press_3= driver.findElement(By.id("signInSubmit"));
press_3.click();










		
			}

		

	}


