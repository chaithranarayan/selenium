package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception  {
		File src=new File("D:\\Excel data");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("data from row0 and column0"+ data0);
	String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("data from row0 and column 1"+data1);
	wb.close();

	}

}
