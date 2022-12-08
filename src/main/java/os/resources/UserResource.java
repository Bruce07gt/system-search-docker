package os.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import os.domain.User_db;
import os.services.UserServcice;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	private final UserServcice userServcice;
	
	private UserResource(UserServcice userServcice) {
		this.userServcice = userServcice;
	}
	
	@GetMapping
	public List<User_db>findAllUser() {
		return userServcice.findAllUser();
	}
	
	@GetMapping("/{id}")
	public Optional<User_db> findById(@PathVariable("id") int id) {
		return userServcice.findById(id);
	}
	
	@PostMapping
	public User_db saveUser(@RequestBody User_db user_db) {
		return userServcice.saveUser(user_db);
	}
	
	@PutMapping
	public User_db updateUser(@RequestBody User_db user_db) {
		return userServcice.saveUser(user_db);
	}
	
	@DeleteMapping
	public void deleteUser(@PathVariable("id") Integer id) {
		userServcice.deleteUser(id);
	}
}
