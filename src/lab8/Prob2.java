package lab8;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Prob2 {
    public static void main(String[] args) {
        XSSFWorkbook workbook = null;

        try {
            FileInputStream file = new FileInputStream(new File("laborator8_input.xlsx"));
            workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);


            XSSFFont boldFont = workbook.createFont();
            boldFont.setBold(true);
            XSSFCellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFont(boldFont);
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);


            XSSFCellStyle yellowStyle = workbook.createCellStyle();
            yellowStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            int rowNum = 0;

            for (Row row : sheet) {
                // Font + fundal verde pentru antet
                if (rowNum == 0) {
                    for (Cell cell : row) {
                        cell.setCellStyle(headerStyle);
                    }

                    // Adaugă anteturi noi în G și H
                    Cell cellG = row.createCell(6);
                    cellG.setCellValue("Max");
                    cellG.setCellStyle(headerStyle);

                    Cell cellH = row.createCell(7);
                    cellH.setCellValue("Medie");
                    cellH.setCellStyle(headerStyle);
                } else {
                    int excelRow = rowNum + 1; // Excel e 1-based

                    // MAX(Di:Fi) în col G (index 6)
                    Cell cellG = row.createCell(6);
                    cellG.setCellFormula(String.format("MAX(D%d:F%d)", excelRow, excelRow));
                    cellG.setCellStyle(yellowStyle);

                    // AVERAGE(Di:Fi) în col H (index 7)
                    Cell cellH = row.createCell(7);
                    cellH.setCellFormula(String.format("AVERAGE(D%d:F%d)", excelRow, excelRow));
                    cellH.setCellStyle(yellowStyle);
                }

                rowNum++;
            }

            file.close(); // Închide fișierul original

            // Auto-size coloane
            for (int i = 0; i <= 7; i++) {
                sheet.autoSizeColumn(i);
            }

            // Scriere în fișier nou
            FileOutputStream outFile = new FileOutputStream(new File("output8.xlsx"));
            workbook.write(outFile);
            outFile.close();
            workbook.close();

            System.out.println("Fisierul 'output8.xlsx' a fost salvat cu succes.");

        } catch (IOException e) {
            throw new RuntimeException(e);

}


    }
}
