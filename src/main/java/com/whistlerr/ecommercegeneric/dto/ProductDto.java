package com.whistlerr.ecommercegeneric.dto;

public record ProductDto(Long productId,
        String productName,
        String tenantId,
        String productDesc,
        String productType,
        String productStatus,
        String createdDt,
        String updateDt
){
}
