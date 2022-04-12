package com.example.clase11gtics.controller;

import com.example.clase11gtics.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductoController {

    @Autowired
    ProductRepository productRepository;

}
