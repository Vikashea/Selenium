package sampledemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readpoi {
private String scr;

public void readdata() throws IOException
{
	File src=new File("C://Python//data.xlsx");
	
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel is : " +data0);
	
	String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from excel is : " +data1);
	
	sheet1.getRow(0).createCell(2).setCellValue("pass");
	sheet1.getRow(1).createCell(2).setCellValue("fail");
	
	FileOutputStream fo=new FileOutputStream(scr);
	wb.write(fo);
	
	wb.close();
	
}
}
