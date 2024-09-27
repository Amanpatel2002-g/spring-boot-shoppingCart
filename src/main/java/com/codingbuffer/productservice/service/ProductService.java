package com.codingbuffer.productservice.service;

import java.util.List;

import com.codingbuffer.productservice.model.ProductRequest;
import com.codingbuffer.productservice.model.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productModel);

    List<ProductRequest> getAllProudcts();

    ProductResponse getProudctById(long productIdRequest);

}
