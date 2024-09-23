package com.codingbuffer.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingbuffer.productservice.model.ProductRequest;
import com.codingbuffer.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProuductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest product) {
        long productId = productService.addProduct(product);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);

    }

    // @GetMapping
    // public List<ProductModel> getAllProducts(){
    // return productService.getAllProudcts();
    // }

    // @GetMapping("/{id}")
    // public List<ProductModel> getProudctById(@RequestParam String id){
    // return null;
    // }

    // @DeleteMapping("/{id}")
    // public List<ProductModel> DeleteProudctById(@RequestParam String id){
    // return null;
    // }
}
