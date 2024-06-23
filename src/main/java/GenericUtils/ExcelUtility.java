package GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	
	public String  getExcelData(String sheetName, int rowNum, int cellNum) throws IOException       {
		FileInputStream fis=new FileInputStream("./Test Data/Rest Excel Data.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
	String	excelData=workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return excelData;
	//return excelData;
	}
}

