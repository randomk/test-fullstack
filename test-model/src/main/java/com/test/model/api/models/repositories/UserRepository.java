package com.test.model.api.models.repositories;


import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.test.model.api.models.entities.User;

public interface UserRepository extends CrudRepository<User,BigInteger>{

}
