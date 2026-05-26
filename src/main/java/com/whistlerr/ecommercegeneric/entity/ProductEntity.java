package com.whistlerr.ecommercegeneric.entity;

import jakarta.persistence.*;

@Table(name = "products_table")
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long product_id;
}
