package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDF2 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\MyWorkSpace\\MavenProject\\src\\test\\resources\\SampleData1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String s = cell.getStringCellValue();
					System.out.println(s);
					break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
						
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long round = Math.round(numericCellValue);
						if (round==numericCellValue) {
							String valueOf = String.valueOf(round);
							System.out.println(valueOf);
						}else {
						String valueOf = String.valueOf(numericCellValue);
						System.out.println(valueOf);
						}
					}
					break;
				case BOOLEAN:
					boolean booleanCellValue = cell.getBooleanCellValue();
					System.out.println(booleanCellValue);
					break;
				default:
					break;
				}
					
			}
		}
	}
}
