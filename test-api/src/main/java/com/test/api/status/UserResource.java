package com.test.api.status;

import com.test.model.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Rodrigo Melgar on 24/09/17.
 */
@RestController
@RequestMapping("/api")
public class UserResource {

    private final UserService service;

    @Autowired
    public UserResource(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        return service.add(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> find() {
        return service.list();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User find(@PathVariable("id") Long id) {
        return service.find(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") Long id) {
        service.remove(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        service.update(user);
    }

}
