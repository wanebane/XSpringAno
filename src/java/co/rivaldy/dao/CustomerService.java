/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rivaldy.dao;

import co.rivaldy.model.Customer;
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
public class CustomerService {

    @PersistenceContext
    private EntityManager em;

    public CustomerService() {
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Transactional
    public void register(Customer cus) {
        //Save employee
        this.getEm().persist(cus);
    }

    public List<Customer> findAll() {
        List<Customer> customers;
        customers = this.getEm().createNamedQuery("Customer.findAll").getResultList();
        return customers;
    }

    public Customer findById(Integer customerId) {
        return getEm().find(Customer.class, customerId);
    }

}
