package com.andreguzzi.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andreguzzi.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
