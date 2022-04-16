package com.jordantanjunwen.user.service;

import com.jordantanjunwen.user.domain.Login;
import com.jordantanjunwen.user.domain.User;
import com.jordantanjunwen.user.exception.UserNotFoundException;

public interface LoginService {

	public User loginUser(Login credentials) throws UserNotFoundException;
}
