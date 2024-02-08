package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDF {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\MyWorkSpace\\MavenProject\\Data\\SampleData1.xlsx");

		FileInputStream stream = new FileInputStream(file);
		// Workbook workbook=new XSSFWorkbook(stream);
		//
		// Sheet sheet = workbook.getSheet("Sheet1");
		// Row row = sheet.getRow(1);
		// Cell cell = row.getCell(1);
		// System.out.println(cell);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell);
			}System.out.println("______________________");
		}

	}
}
