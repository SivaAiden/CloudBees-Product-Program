package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
@Controller
@RequestMapping("/")
public class ProductController {
	@RequestMapping(method = RequestMethod.GET, value = "/main")
	public String Call() {
		return "index";
	}
}
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

 @Autowired
 private ProductService productService;

 @PostMapping
 public Product createProduct(@RequestBody Product product) {
     return productService.createProduct(product);
 }

 @GetMapping("/{productId}")
 public Object readProduct(@PathVariable Long productId) {
     Product product = productService.readProduct(productId);
     if (product != null) {
         return product;
     } else {
         return "Product not found";
     }
 }

 @PutMapping
 public String updateProduct(@RequestBody Product product) {
     return productService.updateProduct(product) ? "Success" : "Failure";
 }

 @DeleteMapping("/{productId}")
 public String deleteProduct(@PathVariable Long productId) {
     return productService.deleteProduct(productId) ? "Success" : "Failure";
 }
}
