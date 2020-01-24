package br.com.rsinet.HUB_BDD.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet produtosSheet;
	private static XSSFWorkbook produtosBook;
	private static XSSFCell produtosCell;
	private static XSSFRow produtosRow;

	public static void setProdutosFile(String Path, String SheetName) throws Exception {
		try {
			FileInputStream produtosFile = new FileInputStream(Path);
			produtosBook = new XSSFWorkbook(produtosFile);
			produtosSheet = produtosBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			produtosCell = produtosSheet.getRow(RowNum).getCell(ColNum);
			String CellData = produtosCell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

		try {

			produtosRow = produtosSheet.getRow(RowNum);

			produtosCell = produtosRow.getCell(ColNum);

			if (produtosCell == null) {

				produtosCell = produtosRow.createCell(ColNum);

				produtosCell.setCellValue(Result);
			} else {

				produtosCell.setCellValue(Result);
			}

			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

			produtosBook.write(fileOut);

			fileOut.flush();

			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

}
