package com.somsak.productservice.ropository;

import com.somsak.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, String> {
}
