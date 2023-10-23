package com.example.marketplace.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Login")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    @Id
    private String userId;
    private String password;

    
}
