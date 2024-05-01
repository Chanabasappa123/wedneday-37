package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_value {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream f1=new FileInputStream("C:\\Users\\l\\eclipse-workspace\\selenium\\Excelsheet\\chandru.xlsx");
Workbook wb=WorkbookFactory.create(f1);
Sheet  s1=wb.getSheet("login");
Row r1=s1.getRow(0);
Cell  c1=r1.getCell(0);
String str=c1.getStringCellValue();
System.out.println(str);
	}

}
