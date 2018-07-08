package com.onya.excel;

import java.io.IOException;

public class Module {
	Module(Unit a, int param) throws IOException{
		switch(param) {
		case 1: SupahParser f = new SupahParser("LAW41013_0_20180606_141520.XLS");
        		f.setDataInCell(12, 25, a.recipient);
        		f.setDataInCell(33, 146, a.code_OKOF);
        		f.setDataInCell(35, 146, a.num_amort_group);
        		f.setDataInCell(37, 146, a.num_fact);
        		f.setDataInCell(36, 146, a.num_inventory);
        		f.setDataInCell(20, 22, a.vendor_fact);
        		f.setDataInCell(22, 1, a.vendor_country + ", " + a.vendor_town);
        		f.save();
		}
	}

}
