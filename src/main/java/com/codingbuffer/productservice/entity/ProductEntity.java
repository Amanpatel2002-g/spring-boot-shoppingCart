package com.codingbuffer.productservice.entity;

import com.codingbuffer.productservice.model.ProductRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prouductId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private long price;

    @Column(name = "QUALITY")
    private long quantity;

    public ProductRequest toProductModel() {
        ProductRequest productModel = new ProductRequest();
        productModel.setPrice(price);
        productModel.setProductName(productName);
        productModel.setQuantity(quantity);
        return productModel;
    }
}
