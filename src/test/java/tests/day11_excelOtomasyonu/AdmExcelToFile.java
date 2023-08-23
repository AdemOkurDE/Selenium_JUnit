package tests.day11_excelOtomasyonu;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

import static java.io.FileDescriptor.out;

public class AdmExcelToFile {

    @Test
    public void adm() throws IOException {
        //String dosyaYolu = "src/test/java/tests/day11_excelOtomasyonu/Locators.xlsx";
        String dosyaYolu = "src/test/java/tests/day11_excelOtomasyonu/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
       Sheet sayfa1 = workbook.getSheet("Sayfa6");
        //Sheet sayfa1 = workbook.getSheet("sayfa1");


    //File newFile=new File("target/locates.java");
      File newFile=new File("target/aaa.java");

    FileWriter fstream=new FileWriter(newFile);

    BufferedWriter yaz=new BufferedWriter(fstream);
        System.out.println(sayfa1.getLastRowNum());
        for (int i = 0; i <= sayfa1.getLastRowNum() ; i++) {

           // String key = sayfa1.getRow(i).getCell(2).toString();
            //String value = sayfa1.getRow(i).getCell(9).toString();
            String key = sayfa1.getRow(i).getCell(0).toString();
           String value = sayfa1.getRow(i).getCell(1).toString();
         //   System.out.println(key+" - "+value);
            yaz.write(key);
            yaz.newLine();
           yaz.write(value);
           yaz.newLine();
            yaz.newLine();
        }
        fis.close();
        yaz.close();
        fstream.close();
        workbook.close();


    }
}
