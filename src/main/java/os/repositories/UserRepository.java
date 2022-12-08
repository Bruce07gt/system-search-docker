package os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import os.domain.User_db;

@Repository
public interface UserRepository extends JpaRepository<User_db, Integer>{

}
