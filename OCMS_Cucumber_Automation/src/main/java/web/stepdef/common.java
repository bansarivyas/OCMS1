package web.stepdef;

import com.codoid.products.exception.FilloException;

import io.cucumber.java.en.When;
import util.ExcelDBReader;

public class common {

	@When("User reads data from Excel")
	public void user_reads_data_excel() throws InterruptedException, FilloException {
		ExcelDBReader reader= new ExcelDBReader();
		reader.getDataFromExcel();
	}
}
