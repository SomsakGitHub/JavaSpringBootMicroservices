package com.somsak.productservice.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product extends BaseEntity {

    //@Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}