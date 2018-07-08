package com.onya.excel;

public class Unit {
	private String Recipient;
	private String AccModel;
	private String AccName;
	private String CodeOKOF;
	
	private String AmortGroupNum;
	private String PassportNum;
	private String FactoryNum;
	private String InventoryNum;
	private String InventoryCodeNum;
	
	private String ManufacturerName;
	private String ManufacturerTownLocation;
	private String ManufacturerCountryLocation;
	
	private String VendorFactoryName;
	private String VendorTownLocation;
	private String VendorCountryLocation;
	
	private int DocName;
	private String DocNum;
	private String DocDate;
	
	private String Length;
	private String Width;
	private String Height;
	private String Weight;
	private String Power;
	
	Unit(String Recipient, String AccModel, String AccName, String CodeOKOF, 
	String AmortGroupNum, String PassportNum, String FactoryNum, String InventoryNum,
	String InventoryCodeNum, String ManufacturerName,String ManufacturerTownLocation,
	String ManufacturerCountryLocation,String VendorFactoryName,String VendorTownLocation,
	String VendorCountryLocation,String DocNum,String DocDate){
		this.Recipient = Recipient;
		this.AccModel = AccModel;
		this.AccName = AccName;
		this.CodeOKOF = CodeOKOF;
		this.AmortGroupNum = AmortGroupNum;
		this.PassportNum = PassportNum;
		this.FactoryNum = FactoryNum;
		this.InventoryNum = InventoryNum;
		this.InventoryCodeNum = InventoryCodeNum;
		this.ManufacturerName = ManufacturerName;
		this.ManufacturerTownLocation = ManufacturerTownLocation;
		this.ManufacturerCountryLocation = ManufacturerCountryLocation;
		this.VendorFactoryName = VendorFactoryName;
		this.VendorTownLocation = VendorTownLocation;
		this.VendorCountryLocation = VendorCountryLocation;
		this.DocNum = DocNum;
		this.DocDate = DocDate;
	}
	public String getRecipientValue() {
		return Recipient;
	}
	public String getAccModelValue() {
		return AccModel;
	}
	public String getAccNameValue() {
		return AccName;
	}
	public String getCodeOKOFValue() {
		return CodeOKOF;
	}
	public String getAmortGroupNumValue() {
		return AmortGroupNum;
	}
	public String getPassportNumValue() {
		return PassportNum;
	}
	public String getFactoryNumValue() {
		return FactoryNum;
	}
	public String getInventoryNumValue() {
		return InventoryNum;
	}
	public String getInventoryCodeNumValue() {
		return InventoryCodeNum;
	}
	public String getManufacturerNameValue() {
		return ManufacturerName;
	}
	public String getManufacturerTownLocationValue() {
		return ManufacturerTownLocation;
	}
	public String getManufacturerCountryLocationValue() {
		return ManufacturerCountryLocation;
	}
	public String getVendorFactoryNameValue() {
		return VendorFactoryName;
	}
	public String getVendorTownLocationValue() {
		return VendorTownLocation;
	}
	public String getVendorCountryLocationValue() {
		return VendorCountryLocation;
	}
	public String getDocNumValue() {
		return DocNum;
	}
	public String getDocDateValue() {
		return DocDate;
	}
}
