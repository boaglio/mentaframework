package org.mentawai.example.productsearch.dao;

import java.util.Collection;

import org.mentawai.example.productsearch.Product;

public interface ProductDAO {

    public void save(Product product);

    public void update(Product product);

    public void delete(Product product);

    public Product findById(Long id);
    
    public Collection findByName(String name);
    
    public Collection findAll();
}
