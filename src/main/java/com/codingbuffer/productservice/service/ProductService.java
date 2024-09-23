package com.codingbuffer.productservice.service;

import java.util.List;

import com.codingbuffer.productservice.model.ProductRequest;

public interface ProductService {

    long addProduct(ProductRequest productModel);

    List<ProductRequest> getAllProudcts();

}
