package org.mentawai.example.productsearch.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.mentawai.example.productsearch.Product;
import org.mentawai.example.productsearch.dao.ProductDAO;

public class ProductDAOHibernateImpl implements ProductDAO {

    private Session session;

    public void delete(Product product) {
        session.delete(product);

    }

    public Collection findByName(String name) {
        Criteria criteria = session.createCriteria(Product.class);
        criteria.add(Expression.like("name", '%' + name + '%'));
        return criteria.list();
    }

    public void save(Product product) {
        session.save(product);

    }

    public void update(Product product) {
        session.update(product);

    }

    public Product findById(Long id) {
        return (Product) this.session.get(Product.class, id);
    }

    public Collection findAll() {
        return this.session.createCriteria(Product.class).list();
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

}
