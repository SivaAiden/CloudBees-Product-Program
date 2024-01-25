package com.example.demo;

import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {
 private final Map<Long, Product> productMap = new ConcurrentHashMap<>();
 private Long productIdCounter = 1L;

 public Product createProduct(Product product) {
     product.setProductId(productIdCounter++);
     productMap.put(product.getProductId(), product);
     return product;
 }

 public Product readProduct(Long productId) {
     return productMap.get(productId);
 }

 public boolean updateProduct(Product product) {
     if (productMap.containsKey(product.getProductId())) {
         productMap.put(product.getProductId(), product);
         return true;
     }
     return false;
 }

 public boolean deleteProduct(Long productId) {
     return productMap.remove(productId) != null;
 }
}
