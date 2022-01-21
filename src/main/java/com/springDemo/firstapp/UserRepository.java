package com.springDemo.firstapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springDemo.firstapp.io.enitiy.UserEnitiy;

@Repository
public interface UserRepository extends CrudRepository<UserEnitiy, Long> {

	UserEnitiy findUserByEmail(String email);
}
