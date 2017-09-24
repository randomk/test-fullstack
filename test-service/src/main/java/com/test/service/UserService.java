package com.test.service;

import com.test.model.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rodrigo Melgar on 24/09/17.
 */
@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User add(User user) {

        return repository.save(user);
    }

    public List<User> list() {

        return repository.findAll();
    }

    public User find(Long id) {

        return repository.findOne(id);
    }

    public void remove(Long id) {

        repository.delete(id);
    }

    public User update(User user) {

        return repository.save(user);
    }

}
