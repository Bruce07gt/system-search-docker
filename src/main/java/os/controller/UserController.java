package os.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import os.model.User;
import os.services.UserServcice;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private final UserServcice userServcice;
	
	private UserController(UserServcice userServcice) {
		this.userServcice = userServcice;
	}
	
	@GetMapping
	public List<User>findAllUser() {
		return userServcice.findAllUser();
	}
	
	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable("id") int id) {
		return userServcice.findById(id);
	}
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userServcice.saveUser(user);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userServcice.saveUser(user);
	}
	
	@DeleteMapping
	public void deleteUser(@PathVariable("id") Integer id) {
		userServcice.deleteUser(id);
	}

	@PatchMapping("/{id}")
	public User updateProductFields(@PathVariable int id,@RequestBody Map<String, Object> fields){
		return userServcice.updateProductByFields(id,fields);
	}
}
