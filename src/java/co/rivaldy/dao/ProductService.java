/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rivaldy.dao;

import co.rivaldy.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RomyRivaldy
 */
@Repository
@Transactional
public class ProductService {

    @PersistenceContext
    private EntityManager em;

    public ProductService() {
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public void register(Product pr) {
        this.getEm().persist(pr);
    }

    public List<Product> findAll() {
        List<Product> products;
        products = this.getEm().createNamedQuery("Product.findAll").getResultList();
        return products;
    }
    public Product findById(Integer productId){
        return getEm().find(Product.class, productId);
    }
}
