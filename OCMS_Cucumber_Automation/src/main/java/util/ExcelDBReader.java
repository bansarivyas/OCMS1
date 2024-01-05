package util;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import web.stepdef.BaseClass;

public class ExcelDBReader extends BaseClass{

	
	public Recordset  getDataFromExcel() throws FilloException {
		Fillo fillo = new Fillo();
		Object[] object = null;
		Connection connection = fillo.getConnection(ConstantsAPI.ACTIVITY_EXCEL_PATH + ConstantsAPI.EXCEL_NAME);
		Recordset recordset = connection.executeQuery("SELECT * FROM Sheet1");
		return recordset;
	}
}
