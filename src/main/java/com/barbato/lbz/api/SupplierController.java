package com.barbato.lbz.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barbato.lbz.repository.jpa.Supplier;
import com.barbato.lbz.service.SupplierService;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Supplier> listAll(){
		return supplierService.getAllSuppliers();
	}

}
