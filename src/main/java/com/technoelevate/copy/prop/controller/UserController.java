package com.technoelevate.copy.prop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.copy.prop.dto.UserDto;
import com.technoelevate.copy.prop.entity.User;
import com.technoelevate.copy.prop.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService; 

	@PostMapping("user")
	public void saveUser(@RequestBody UserDto userDto) {
		
	}
	
	@GetMapping("user/{userId}")
	public User getUser(@PathVariable Long userId) {
	return	userService.getUser(userId);
	}
}
