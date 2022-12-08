package os.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import os.domain.User_db;
import os.repositories.UserRepository;
import os.services.UserServcice;

@Service
public class UserServiceImpl implements UserServcice {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User_db> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User_db> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public User_db saveUser(User_db user_db) {
		return userRepository.save(user_db);
	}

	@Override
	public User_db updateUser(User_db user_db) {
		return userRepository.save(user_db);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
