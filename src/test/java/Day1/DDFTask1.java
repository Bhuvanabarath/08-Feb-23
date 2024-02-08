package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDFTask1 {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		 driver = WebDriverManager.chromedriver().create();
		 driver.get("https://www.amazon.in/");
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone", Keys.ENTER);
		 
//		 Thread.sleep(5000);
		 List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		 
		 File file=new File("C:\\MyWorkSpace\\MavenProject\\src\\test\\resources\\SampleData1.xlsx");
		 FileInputStream stream=new FileInputStream(file);
		 XSSFWorkbook book=new XSSFWorkbook(stream);
		 XSSFSheet sheet = book.createSheet("iPhone2");
		 for (int i = 0; i < elements.size(); i++) {
			 XSSFRow row = sheet.createRow(i);
			 XSSFCell cell = row.createCell(0);
//			 WebElement webElement = elements.get(i);
//			 String text = webElement.getText();
			 System.out.println(elements.get(i).getText());
			 cell.setCellValue(elements.get(i).getText());
			 
		}
	 
		 FileOutputStream out=new FileOutputStream(file);
		 book.write(out);
		 
	}

}
