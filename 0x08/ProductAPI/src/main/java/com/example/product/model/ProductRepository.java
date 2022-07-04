package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        // TODO Implementar
        return null;
    }

    public Product getProductById(Long id) {
        // TODO Implementar
        return null;
    }

    public void addProduct(Product s) {
    }

    public void updateProduct(Product s) {
        // TODO Implementar
    }

    public void removeProduct(Product s) {
        // TODO Implementar
    }

    public void addList(List<Product> listOfProducts) {
        // TODO Implementar
    }
}
