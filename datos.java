package excel;

import java.io.FileOutputStream;
import java.io.OutputStream;
/*import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
*/
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HSSFWorkbook wb = new HSSFWorkbook();
        try ( OutputStream fileOut = new FileOutputStream("miarchivo.xls")) {
            Sheet sheet1 = wb.createSheet("Primer Hoja");
            Sheet sheet2 = wb.createSheet("Segunda Hoja");
            Sheet sheet = wb.createSheet("Tercer Hoja");
            row = sheet.createRow(0); //crear fila. se establece el indice a 0 hasta N                           
            row.createCell(0).setCellValue("Nombre"); // Columna A  
            row.createCell(1).setCellValue("edad"); // Columna B   
            row.createCell(2).setCellValue("sexo");// Columna C  
            row.createCell(3).setCellValue("Correo"); // Columna D
            row.createCell(4).setCellValue("celular"); //Columna E

            row = sheet.createRow(1); //crear fila 2
            row.createCell(0).setCellValue("Hernan Tapia"); // Columna A  
            row.createCell(1).setCellValue(22); // Columna B   
            row.createCell(2).setCellValue("masculino");// Columna C  
            row.createCell(3).setCellValue("her@gmail.com"); // Columna D 
            row CreateCell(4).setCellValue(5575468811); //Columna E
           
            wb.write(fileOut);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setCellValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class HSSFWorkbook {

        public HSSFWorkbook() {
        }

        private HSSFWorkbook() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Sheet createSheet(String primer_Hoja) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Workbook {

        public Workbook() {
        }

        private void write(OutputStream fileOut) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

   
