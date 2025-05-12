package com.anmol.ecom_proj.service;

import com.anmol.ecom_proj.model.Product;
import com.anmol.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {

        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).get();
    }
}
