package excelTable;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dynamic_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		File excelfile= new File("D:\\velocity\\excelfile.xlsx");
		
		  Workbook myworkbook = WorkbookFactory.create(excelfile);
		
		
		Sheet mysheet = myworkbook.getSheet("Sheet3");
		
		int totalNumOfRows = mysheet.getLastRowNum();
		
		 int totalnumOfCells = mysheet.getRow(totalNumOfRows).getLastCellNum()-1;	
		
		
		for(int i=0;i<=totalNumOfRows;i++) {
			
			for (int j=0;j<=totalnumOfCells;j++) {
				
				Cell mycell = mysheet.getRow(i).getCell(j);
				
				 CellType celldatatype = mycell.getCellType();
				
		
				   if(celldatatype==CellType.STRING) {
					   
					  String value = mycell.getStringCellValue();
					  System.out.print(value+" || ");
				   }
				   
				   else if(celldatatype==CellType.NUMERIC)		{
					   
					  double value = mycell.getNumericCellValue();
					  System.out.print(value+"|| ");
					   
				   }
				   else if(celldatatype==CellType.BOOLEAN) {
					   boolean value = mycell.getBooleanCellValue();
					   System.out.print(value+"|| ");
				   }
				   
				   else if(celldatatype==CellType.BLANK) {
					   
					   System.out.print(" ");
					   
				   }
				   
				   else {
					   System.out.println("fail");
				   }}
			
				   System.out.println();
				   
					  
				   }
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	


