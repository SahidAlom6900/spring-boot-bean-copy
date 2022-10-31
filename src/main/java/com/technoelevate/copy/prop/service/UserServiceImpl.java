package com.technoelevate.copy.prop.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.technoelevate.copy.prop.entity.User;
import com.technoelevate.copy.prop.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public User getUser(Long userId) {
		return userRepository.findById(userId).orElseThrow();
//		return BeanCopy.objectProperties(user, UserDto.class);
	}

}
