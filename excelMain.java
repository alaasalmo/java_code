package poiexel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.InputStream; 
import java.util.Iterator; 
  
 
import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.hssf.usermodel.HSSFRow; 
import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;   
 
import org.apache.poi.xssf.usermodel.XSSFCell; 
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 


public class excelMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:/alaa/tmp/Book1.xlsx"));           
		FileOutputStream fileOut = new FileOutputStream("C:/alaa/tmp/new.xlsx");
		XSSFSheet sheet1 = wb.getSheet("Summary");
		XSSFRow row = sheet1.getRow(15);
		XSSFCell cell = row.getCell(3);
	    //cell.setCellValue("Bharthan");

		//wb.write(fileOut);
		//log.info("Written xls file");
		fileOut.close();

	}

}
