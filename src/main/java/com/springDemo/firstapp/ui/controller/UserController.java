package com.springDemo.firstapp.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springDemo.firstapp.shared.UserDto;
import com.springDemo.firstapp.ui.Requestmodel.UserRequestModel;
import com.springDemo.firstapp.ui.responseModel.UserRest;
import com.springDemo.firstapp.ui.service.UserServices;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserServices userService;
	
	@GetMapping
	public String getUser() {
		return "get one user";
	}
	@PostMapping
	public UserRest createUser(@RequestBody UserRequestModel userDetails) {
		
		UserRest resposone = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto userCreated = userService.createUser(userDto);
		BeanUtils.copyProperties(userCreated, resposone);
		return resposone;
	}
	@PutMapping
	public String updateUser() {
		return "updated  one user";
	}
	@DeleteMapping
	public String deleteUser() {
		return "Delete one user";
	}
}
