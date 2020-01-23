package selenium;

public class Data {

	public static String nameLaptop() throws Exception {
		return ExcelUtils.getCellData(1, 0);
	}
	
	public static String nameMice() throws Exception {
		return ExcelUtils.getCellData(2, 0);
	}
	
	public static String nameInvalid() throws Exception {
		return ExcelUtils.getCellData(3, 0);
	}
	
	public String fullNameLaptop() throws Exception {
		return ExcelUtils.getCellData(1, 1);
	}
	
	public static String fullNameMice() throws Exception {
		return ExcelUtils.getCellData(2, 1);
	}
	
}
