package io.github.oliviercailloux.y2016.test_ods;

import java.io.InputStream;

import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.table.Cell;

/**
 * Simplified from <a href=
 * "https://incubator.apache.org/odftoolkit/simple/demo/demo9.html">odftoolkit
 * doc</a>.
 *
 * @author Olivier Cailloux
 *
 */
public class TestODS {
	public static void main(String[] args) throws Exception {
		new TestODS().generateSpreadsheetDocument();
	}

	public void generateSpreadsheetDocument() throws Exception {
		try (InputStream inputStream = TestODS.class.getResourceAsStream("demo9_data.ods");
				SpreadsheetDocument spreadsheetDoc = SpreadsheetDocument.loadDocument(inputStream)) {
			Cell positionCell = spreadsheetDoc.getTableByName("B").getCellByPosition("E1");
			System.out.println(positionCell.getDisplayText());
			positionCell.setStringValue("ploum");
			spreadsheetDoc.save("demo9s.ods");
		}
	}
}
