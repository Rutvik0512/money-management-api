package com.rutvik.money.management.api.services;

import java.util.List;

import com.rutvik.money.management.api.payloads.UserDto;

public interface UserServices {
	
	UserDto updateUser(UserDto user, Long userId);
	
	UserDto getUserById(Long userId);
	
	List<UserDto> getAllUser();
	
	void deleteUser(Long userId);
}
