package com.example.clase11gtics.controller;

import com.example.clase11gtics.entity.Category;
import com.example.clase11gtics.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("")
    public List<Category> listarProductos() {
        return categoryRepository.findAll();
    }

}
