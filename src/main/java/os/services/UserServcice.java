package os.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import os.model.User;


public interface UserServcice {
	List<User>findAllUser();
	Optional<User> findById(Integer id);
	User saveUser(User user);
	User updateUser(User user);
	void deleteUser(Integer id);
	User updateProductByFields(int id, Map<String, Object> fields);
}
