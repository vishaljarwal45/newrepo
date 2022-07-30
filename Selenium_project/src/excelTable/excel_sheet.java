package excelTable;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_sheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		
		
		File name = new File("D:\\velocity\\excelfile.xlsx");
		 
		
		
		String file1 = WorkbookFactory.create(name).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();  	
	System.out.println(file1);
		
		
		
		
		
		
		
		
		
		
	}

	}


