package com.example.clase11gtics.controller;

import com.example.clase11gtics.entity.Product;
import com.example.clase11gtics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
public class ProductoController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
    public List<Product> listarProductos() {
        return productRepository.findAll();
    }
}

