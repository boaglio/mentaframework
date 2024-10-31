package org.mentawai.example.productsearch;

import java.util.Collection;

import org.mentawai.example.productsearch.dao.ProductDAO;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public void delete(Product p) {
        productDAO.delete(p);

    }

    public Collection findAll() {
        return productDAO.findAll();
    }

    public Product findById(Long id) {
        return productDAO.findById(id);
    }

    public void save(Product p) {
        productDAO.save(p);

    }

    public void update(Product p) {
        Product old = productDAO.findById(p.getId());
        old.setName(p.getName());
        old.setDescription(p.getDescription());
        productDAO.update(old);
    }

    public Collection findByName(String name) {
        return this.productDAO.findByName(name);
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void delete(Long id) {
        Product product = productDAO.findById(id);
        productDAO.delete(product);
        
    }

}
