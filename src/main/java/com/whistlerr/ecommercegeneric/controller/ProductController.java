package com.whistlerr.ecommercegeneric.controller;


import com.whistlerr.ecommercegeneric.dto.ProductDto;
import com.whistlerr.ecommercegeneric.entity.ProductEntity;
import com.whistlerr.ecommercegeneric.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public List<ProductDto> getProducts(){
         return  productService.getAllProducts();



    }

}
