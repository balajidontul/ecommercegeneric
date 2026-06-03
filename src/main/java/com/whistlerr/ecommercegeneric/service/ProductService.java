package com.whistlerr.ecommercegeneric.service;

import com.whistlerr.ecommercegeneric.dto.ProductDto;
import com.whistlerr.ecommercegeneric.entity.ProductEntity;
import com.whistlerr.ecommercegeneric.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();

        return productEntities.stream()
                .map(e -> new ProductDto(
                        e.getProduct_id(),
                        e.getProduct_Name(),
                        e.getTenant_id(),
                        e.getProduct_desc(),
                        e.getProduct_type(),
                        e.getProduct_status(),
                        e.getCreated_dt(),
                        e.getUpdated_dt()
                )).toList();

    }

}
