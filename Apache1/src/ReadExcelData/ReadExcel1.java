package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		File src=new File("D:\\Excel data\\Testdata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	int rowcount=sheet1.getLastRowNum();//it will return the number of rows
	System.out.println("total number of rows is"+(rowcount+1));
	
	for(int i=0;i<rowcount;i++) {
		
	String data0=	sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("test data from excel is"+data0);
	System.out.println("data from row"+i+"is"+data0);
	}
	
	wb.close();

	}

}
