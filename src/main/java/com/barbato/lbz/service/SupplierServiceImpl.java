package com.barbato.lbz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbato.lbz.repository.api.SupplierRepository;
import com.barbato.lbz.repository.jpa.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public List<Supplier> getAllSuppliers() {
		List<Supplier> list = (List<Supplier>)supplierRepository.findAll();
		return list;
	}

}
