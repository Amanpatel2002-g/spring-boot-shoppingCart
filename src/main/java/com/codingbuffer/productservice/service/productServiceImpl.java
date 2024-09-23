package com.codingbuffer.productservice.service;

import java.util.List;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingbuffer.productservice.entity.ProductEntity;
import com.codingbuffer.productservice.model.ProductRequest;
import com.codingbuffer.productservice.repository.ProductRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class productServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("ADDING PRODUCT...");
         
        ProductEntity productEntity = ProductEntity
                                        .builder().
                                        productName(productRequest.getProductName())
                                        .quantity(productRequest.getQuantity())
                                        .price(productRequest.getPrice())
                                        .build();
        productRepository.save(productEntity);
        log.info("PROUDCT ADDED SUCCESSFULLY...");
        return productEntity.getProuductId();
    }

    @Override
    public List<ProductRequest> getAllProudcts() {
        // return productRepository.findAll().stream().map(product-> {
        //     ProductModel productModel = product.toProductModel();
        //     return productModel;
        // }).collect(Collectors.toList());
        return null;
    }
}



