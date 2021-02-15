package com.muhutech.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muhutech.productservice.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
		

}
