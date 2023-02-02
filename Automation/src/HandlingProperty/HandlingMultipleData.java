package HandlingProperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/avnish.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("CreateCustomer").getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String un = wb.getSheet("CreateCustomer").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("CreateCustomer").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pw);
		}
		

	}

}
