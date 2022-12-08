package os.services;

import java.util.List;
import java.util.Optional;

import os.domain.User_db;

public interface UserServcice {
	List<User_db>findAllUser();
	Optional<User_db> findById(Integer id);
	User_db saveUser(User_db user_db);
	User_db updateUser(User_db user_db);
	void deleteUser(Integer id);

}
