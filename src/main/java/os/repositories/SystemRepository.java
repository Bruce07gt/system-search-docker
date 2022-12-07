package os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import os.domain.System;

@Repository
public interface SystemRepository extends JpaRepository<System, Long>{

}
