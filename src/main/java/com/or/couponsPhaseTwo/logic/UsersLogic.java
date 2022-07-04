package com.or.couponsPhaseTwo.logic;

import com.or.couponsPhaseTwo.dtos.User;
import com.or.couponsPhaseTwo.entities.UsersEntity;
import com.or.couponsPhaseTwo.repositories.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersLogic {

    @Autowired
    private IUsersRepository usersRepository;

    public long createUser(User user) {
        UsersEntity usersEntity = new UsersEntity(user);
        usersRepository.save(usersEntity);
        return usersEntity.getId();
    }

    public void updateUser(User user) {
        UsersEntity usersEntity = new UsersEntity(user);
        usersRepository.save(usersEntity);
    }

    public void deleteUser(long id) {
        usersRepository.deleteById(id);
    }

    public User getUserById(long id) {
        UsersEntity usersEntity = usersRepository.findById(id).get();
        User user = new User(usersEntity);
        return user;
    }

    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        Iterable<UsersEntity> usersIterable = usersRepository.findAll();
        for (UsersEntity usersEntity : usersIterable) {
            User user = new User(usersEntity);
            usersList.add(user);
        }
        return usersList;
    }
}
