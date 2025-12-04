package com.electrostock.backend.service.Impl;

import com.electrostock.backend.entity.Product;
import com.electrostock.backend.repository.ProductRepository;
import com.electrostock.backend.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

     private final ProductRepository productRepository;

     public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
     }

     @Override
     public Product createProduct(Product product){
         return productRepository.save(product);
     }

     @Override
     public Product updateProduct(Long id, Product product){
         Product existing = getProductById(id);
         existing.setName(product.getName());
         existing.setPrice(product.getPrice());
         existing.setQuantity(product.getQuantity());
         existing.setCategory(product.getCategory());
         return productRepository.save(existing);
     }

     @Override
     public void deleteProduct(Long id){
         productRepository.deleteById(id);
     }

     @Override
     public Product getProductById(Long id){
         return productRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException("Product not found"));
     }

     @Override
     public List<Product> getAllProducts(){
         return productRepository.findAll();
     }

     @Override
     public void updateStock(Long productId, int quantity){
         Product product = getProductById(productId);
         product.setQuantity(product.getQuantity() + quantity);
         productRepository.save(product);

     }


}
