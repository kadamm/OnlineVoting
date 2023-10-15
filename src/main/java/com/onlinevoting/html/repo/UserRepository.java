package com.onlinevoting.html.repo;

import org.springframework.data.repository.CrudRepository;

import com.onlinevoting.html.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
