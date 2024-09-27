package com.codingbuffer.productservice.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductServiceCustomException extends RuntimeException{
    
    private String errorCode;
    
    public ProductServiceCustomException(String message, String errorcode){
        super(message);
        this.errorCode = errorcode;
    }
}
