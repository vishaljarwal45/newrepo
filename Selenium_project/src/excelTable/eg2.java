package excelTable;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		
		File excelfile= new File("D:\\velocity\\excelfile.xlsx");
		
		  Workbook myworkbook = WorkbookFactory.create(excelfile);
		
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
		
		double value = mysheet.getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(value);
		
		
		Cell mycell = mysheet.getRow(0).getCell(1);
		
		System.out.println(mycell.getCellType());
		System.out.println(mycell.getBooleanCellValue());
//		System.out.println(mycell.getStringCellValue());   Cannot get a STRING value from a BOOLEAN cell
		
		
		Cell mycell2 = mysheet.getRow(0).getCell(2);
		
		
		System.out.println(mycell2.getRowIndex());
		System.out.println(mycell2.getCellType());
		System.out.println(mycell2.getCellComment());
		System.out.println(mycell2.getStringCellValue());

		
		
		
		
	}

}
