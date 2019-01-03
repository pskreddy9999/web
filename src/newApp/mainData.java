package newApp;

public class mainData{
//	    Data\\PIM.xlsx(Create) Data\\Book1.xlsx(Sheet1)
	static final String xlpath = "Data\\Book1.xlsx";
	static final String sheetName = "Sheet1";
	static int tcrowNum = 3;

	public static void main(String[] args) {
		Variable.tcData = HashmapData.getData(xlpath, sheetName, tcrowNum);
		
		String val = Variable.tcData.get("VAL");
		System.out.println(val);
	}
}
