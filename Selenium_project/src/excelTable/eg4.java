package excelTable;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// single row and column reading

		File excelfile= new File("D:\\velocity\\excelfile.xlsx");
		
		    Sheet mysheet = WorkbookFactory.create(excelfile).getSheet("Sheet2");
		
	    for(int i=0;i<=2;i++) {
	    	
	    	 String value = mysheet.getRow(0).getCell(i).getStringCellValue();
	    	  System.out.println(value);
	    }
		
		for(int i=0;i<=3;i++) {
			
			         String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
