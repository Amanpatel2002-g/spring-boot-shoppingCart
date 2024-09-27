package com.codingbuffer.productservice.service;

import java.util.List;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingbuffer.productservice.Exception.ProductServiceCustomException;
import com.codingbuffer.productservice.entity.ProductEntity;
import com.codingbuffer.productservice.model.ProductRequest;
import com.codingbuffer.productservice.model.ProductResponse;
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
    public ProductResponse getProudctById(long productIdRequest) {
        log.info("finding the proudct by requestedProductId: "+ productIdRequest);
        ProductEntity productEntity = productRepository.findById(productIdRequest).orElseThrow(()-> new ProductServiceCustomException("Id doesn't exist", "PRODUCT_NOT_FOUND"));
        log.info("Proudct found successfully");
        return ProductResponse.builder()
        .productId(productEntity.getProuductId())
        .productName(productEntity.getProductName())
        .quantity(productEntity.getQuantity())
        .price(productEntity.getPrice())
        .build();
    }

    @Override
    public List<ProductRequest> getAllProudcts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProudcts'");
    }
}



