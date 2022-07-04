package ReadExcelData;

import library.ExcelDataConfig;

public class ReadExcelfromlibrary {

	public static void main(String[] args) {
		ExcelDataConfig excel=new ExcelDataConfig("D:\\Excel data\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));

	}

}
