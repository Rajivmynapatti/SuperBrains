package onboarding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;



public class ReadExcel {
	
	//public static void main(String args[]) throws Exception {
	@Test
		public void re() throws IOException {	
		File src= new File("D:\\ExcelSheets\\Testdata.xls");
		
		FileInputStream fis= new FileInputStream(src);
		
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet1= wb.getSheetAt(0);
		System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());
	}

}
