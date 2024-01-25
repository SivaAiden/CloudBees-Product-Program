package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

 @Autowired
 private ProductRepository productRepository;

 public Product createProduct(Product product) {
     return productRepository.createProduct(product);
 }

 public Product readProduct(Long productId) {
     return productRepository.readProduct(productId);
 }

 public boolean updateProduct(Product product) {
     return productRepository.updateProduct(product);
 }

 public boolean deleteProduct(Long productId) {
     return productRepository.deleteProduct(productId);
 }
}
