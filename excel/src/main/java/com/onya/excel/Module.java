package com.onya.excel;

import java.io.IOException;

public class Module {
	Module(Unit a, int param) throws IOException{
		switch(param) {
		case 1: ExcelParser f = new ExcelParser("LAW41013_0_20180606_141520.XLS");
        		f.setDataInCell(12, 25, a.getRecipientValue());
        		f.setDataInCell(33, 146, a.getCodeOKOFValue());
        		f.setDataInCell(35, 146, a.getAmortGroupNumValue());
        		f.setDataInCell(37, 146, a.getFactoryNumValue());
        		f.setDataInCell(36, 146, a.getInventoryNumValue());
        		f.setDataInCell(20, 22, a.getVendorFactoryNameValue());
        		f.setDataInCell(35, 64, a.getDocNumValue());
        		f.setDataInCell(35, 83, a.getDocDateValue());
        		f.setDataInCell(22, 1, a.getVendorCountryLocationValue() + ", " + a.getVendorTownLocationValue());
        		f.save();
		}
	}

}
