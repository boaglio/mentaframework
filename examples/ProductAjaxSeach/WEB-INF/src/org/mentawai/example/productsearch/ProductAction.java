package org.mentawai.example.productsearch;

import java.util.Collection;

import org.mentawai.core.BaseAction;

/**
 * The action that executes the services of the Product entity.
 * 
 * @author Rubem Azenha (rubem.azenha@gmail.com)
 */
public class ProductAction extends BaseAction {

    private ProductService productService;

    private Long id;

    private String name;

    private Product product;

    /**
     * List all the products.
     */
    public String execute() throws Exception {

        Collection products = productService.findAll();
        output.setValue("products", products);

        return SUCCESS;
    }

    /**
     * Persist a product.
     */
    public String add() throws Exception {

        productService.save(product);
        return "add";
    }

    /**
     * Find a product in the database based on his name or part of it.
     */
    public String findByName() throws Exception {
        Collection products = productService.findByName(name);
        output.setValue("products", products);
        return SUCCESS;
    }

    /**
     * Delete a product from de database.
     */
    public String delete() throws Exception {
        productService.delete(id);
        return "delete";
    }

    /**
     * Update a product in the database.
     */
    public String update() throws Exception {
        productService.update(product);
        return "update";
    }

    public String getById() {
        Product product = productService.findById(id);
        output.setValue("product", product);
        return "getById";

    }

    // Optional setters and getters

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
