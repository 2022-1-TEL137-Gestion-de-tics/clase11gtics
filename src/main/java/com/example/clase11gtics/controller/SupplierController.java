package com.example.clase11gtics.controller;

import com.example.clase11gtics.entity.Supplier;
import com.example.clase11gtics.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/supplier")
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping("")
    public List<Supplier> listarProductos() {
        return supplierRepository.findAll();
    }

}
