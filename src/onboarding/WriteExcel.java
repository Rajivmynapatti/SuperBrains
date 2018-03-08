package onboarding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;



public class WriteExcel {
	
	
		@Test
	public void we() throws IOException {
		
			
			File src= new File("D:\\ExcelSheets\\Testdata.xls");
		
		FileInputStream fis= new FileInputStream(src);
		
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet1= wb.getSheet("sheet123");
		sheet1.getRow(1).createCell(3).setCellValue("Shabbir");
		sheet1.getRow(2).createCell(3).setCellValue("ansari");
	//	sheet1.getRow(2).getCell(2).removeCellComment();
		FileOutputStream fout= new FileOutputStream(src);
		wb.write(fout);
		wb.close();
	//	HSSFSheet sheet2= wb.getSheetAt(2);
		
		/*System.out.println("here");
		sheet2.getRow(3).createCell(1).setCellValue("M");
		sheet2.getRow(3).createCell(2).setCellValue("rajiv");
		sheet2.getRow(2).getCell(2).removeCellComment();
		FileOutputStream fout2= new FileOutputStream(src);
		wb.write(fout2);
		wb.close();
*/
}}
