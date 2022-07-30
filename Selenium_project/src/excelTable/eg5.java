package excelTable;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {



		File excelfile= new File("D:\\velocity\\excelfile.xlsx");
		
		    Sheet mysheet = WorkbookFactory.create(excelfile).getSheet("Sheet2");
		
		
		 for(int i=0;i<=2;i++) {
			 for(int j=0;j<=2;j++) {
				 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+" || ");
				 
			 }
			 
			 System.out.println();
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
