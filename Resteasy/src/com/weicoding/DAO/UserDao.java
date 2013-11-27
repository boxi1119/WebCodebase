package com.weicoding.DAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.weicoding.model.User;

@Stateless
@LocalBean
public class UserDao {

    @PersistenceContext
    private EntityManager em;
    
    public User getUser(int id) {
        return em.find(User.class, id);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addUsers(List<User> Users) {
        for (User User : Users) {
            em.persist(User);
        }
    }
    
}
