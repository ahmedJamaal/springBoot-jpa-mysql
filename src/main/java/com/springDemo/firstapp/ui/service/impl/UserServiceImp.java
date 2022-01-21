package com.springDemo.firstapp.ui.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDemo.firstapp.UserRepository;
import com.springDemo.firstapp.io.enitiy.UserEnitiy;
import com.springDemo.firstapp.shared.UserDto;
import com.springDemo.firstapp.shared.Utils;
import com.springDemo.firstapp.ui.service.UserServices;


@Service
public class UserServiceImp implements UserServices{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils utils;
	
	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepository.findUserByEmail(user.getEmail()) != null ) throw new RuntimeException("this emial has login before");
		UserEnitiy userEnity = new UserEnitiy();
		
		BeanUtils.copyProperties(user, userEnity);
		userEnity.setEncrptPassword("passwordEnc");
		
		userEnity.setUserId(utils.generateUserId());
		
		UserEnitiy dbResult =userRepository.save(userEnity);
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(dbResult, userDto);
		
		return userDto;
	}

	
}
