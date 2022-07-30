package excelTable;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		File excelfile= new File("D:\\velocity\\excelfile.xlsx");
		
		    Sheet mysheet = WorkbookFactory.create(excelfile).getSheet("Sheet2");
		
		
		 int totalNumRows = mysheet.getLastRowNum();
		System.out.println(totalNumRows);
		
	     int totalNumCell = mysheet.getRow(0).getLastCellNum()-1;
		
		System.out.println(totalNumCell);
		
		
		for(int i=0;i<=totalNumRows;i++) {
		
			for(int j=0;j<=totalNumCell;j++) {
				
			 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+"  ||  ");
				
		}
		
		System.out.println();
		
		
		
		
		
	}

}}
