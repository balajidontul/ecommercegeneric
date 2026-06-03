package com.whistlerr.ecommercegeneric.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "products_table")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long product_id;

    @Column
    String product_Name;

    @Column
    String tenant_id;

    @Column
    String product_desc;

    @Column
    String product_type;

    @Column
    String product_status;

    @Column
    String created_dt;

    @Column
    String updated_dt;
}
