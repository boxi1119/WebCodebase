package com.weicoding.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;


import com.weicoding.DAO.UserDao;
import com.weicoding.model.User;

//@Path("/users")
//@LocalBean
@Stateless
public class UserService implements UserServiceIntf{

    @EJB
    private UserDao UsersDao;

//    @GET
//    @Path("/{id}")
    public User getUser(int id) {
         return UsersDao.getUser(id);
    }
    
//    @POST
//    public void addUsers(List<User> Users) {
//        UsersDao.addUsers(Users);
//    }
    
}
