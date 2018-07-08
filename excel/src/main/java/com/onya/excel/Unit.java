package com.onya.excel;

public class Unit {
	String recipient;
	String AccModel;
	String AccName;
	String code_OKOF;
	
	String num_amort_group;
	String num_pasport;
	String num_fact;
	String num_inventory;
	String num_inventory_code;
	
	String manufacturer_fact;
	String manufacturer_town;
	String manufacturer_country;
	
	String vendor_fact;
	String vendor_town;
	String vendor_country;
	
	String doc_name;
	String doc_num;
	String doc_date;
	
	String dlina;
	String shirina;
	String visota;
	String ves;
	String moshnost;
	
	Unit(String recipient, String AccModel, String AccName, String code_OKOF, 
	String num_amort_group, String num_pasport, String num_fact, String num_inventory, String num_inventory_code,
	String manufacturer_fact,
	String manufacturer_town,String manufacturer_country,String vendor_fact,
	String vendor_town,String vendor_country,String doc_name,String doc_num,
	String doc_date){
		this.recipient = recipient;
		this.AccModel = AccModel;
		this.AccName = AccName;
		this.code_OKOF = code_OKOF;
		this.num_amort_group = num_amort_group;
		this.num_pasport = num_pasport;
		this.num_fact = num_fact;
		this.num_inventory = num_inventory;
		this.num_inventory_code = num_inventory_code;
		this.manufacturer_fact = manufacturer_fact;
		this.manufacturer_town = manufacturer_town;
		this.manufacturer_country = manufacturer_country;
		this.vendor_fact = vendor_fact;
		this.vendor_town = vendor_town;
		this.vendor_country = vendor_country;
		this.doc_name = doc_name;
		this.doc_num = doc_num;
		this.doc_date = doc_date;
	}
}
