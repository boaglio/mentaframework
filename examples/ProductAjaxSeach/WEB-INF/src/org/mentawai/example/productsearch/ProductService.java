package org.mentawai.example.productsearch;

import java.util.Collection;

/**
 * The service for doing the operations relative to the Product entity.
 * 
 * @author Rubem Azenha (rubem.azenha@gmail.com)
 */
public interface ProductService {

    /**
     * Persist a product into the database.
     * 
     * @param p
     *            the product to be persisted.
     */
    public void save(Product p);

    /**
     * Delete a product from the database.
     * 
     * @param p
     *            the product to be deleted.
     */
    public void delete(Product p);

    /**
     * Delete a product from the database.
     * 
     * @param id
     *            the id of the product to be deleted.
     */
    public void delete(Long id);

    /**
     * Update a product from the database.
     * 
     * @param p
     *            the product to be updated.
     */
    public void update(Product p);

    /**
     * Find a product in the database.
     * 
     * @param id
     *            the id of the product that you want to find.
     * @return the product with the given id or null if no product was found.
     */
    public Product findById(Long id);

    /**
     * Find all the products from the database.
     * 
     * @return a collection with all the products if the database.
     */
    public Collection findAll();

    /**
     * Find all products with the given name or part of it.
     * 
     * @param name
     *            the name (or part of it) of the product that you want to find.
     * @return a collection with all the product with the given nam (or part of
     *         it).
     */
    public Collection findByName(String name);

}
