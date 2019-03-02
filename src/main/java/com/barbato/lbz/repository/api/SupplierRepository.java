package com.barbato.lbz.repository.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barbato.lbz.repository.jpa.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Long> {

}
