package com.barbato.lbz.resources;

public class SupplierTO {
	
  private long id;
	private String name;
	private String address;
	
	public  SupplierTO() {}
	
	public SupplierTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
