package os.services.impl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.springframework.util.ReflectionUtils;
import os.model.User;

import os.repositories.UserRepository;
import os.services.UserServcice;

@Service
public class UserServiceImpl implements UserServcice {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}


	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	public User updateProductByFields(int id, Map<String, Object> fields) {
		Optional<User> existingProduct = userRepository.findById(id);

		if (existingProduct.isPresent()) {
			fields.forEach((key, value) -> {
				Field field = ReflectionUtils.findField(User.class, key);
				field.setAccessible(true);
				ReflectionUtils.setField(field, existingProduct.get(), value);
			});
			return userRepository.save(existingProduct.get());
		}
		return null;
	}

}
