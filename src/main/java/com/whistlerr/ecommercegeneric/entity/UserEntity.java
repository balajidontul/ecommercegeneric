package com.whistlerr.ecommercegeneric.entity;

import com.whistlerr.ecommercegeneric.util.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_table")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_id;
    String first_name;
    String last_name;
    String email_id;
    String user_phone;
    String password_hash;

    @Enumerated(EnumType.STRING)
    UserRole user_role;

    String user_status;
    String created_dt;
    String updated_dt;

}
