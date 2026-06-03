package com.whistlerr.ecommercegeneric.model;

import lombok.Data;

@Data
public class ProductModel {
    Long productId;
    String productName;
    String tenantId;
    String productDesc;
    String productType;
    String productStatus;
    String createdDt;
    String updatedDt;
}
