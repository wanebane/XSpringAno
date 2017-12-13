/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rivaldy.dao;

import co.rivaldy.model.User;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RomyRivaldy
 */
@Repository
@Transactional
public class UserService {
    
    static final Logger logger = Logger.getLogger(UserService.class.getName());
    @PersistenceUnit
    EntityManagerFactory emf;
    
    private EntityManager em;

    public void saveUser(User user) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
    public User findByUsername(String username){
        User user = new User();
        
        try {
            em = emf.createEntityManager();
            Query query = em.createNamedQuery("Select u from User u where u.username = :username");
            query.setParameter("username", username);
            user = (User) query.getSingleResult();
        } catch (NoResultException ne) {
            logger.severe("Username tidak ada");
        }
        
        return user;
    }
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
