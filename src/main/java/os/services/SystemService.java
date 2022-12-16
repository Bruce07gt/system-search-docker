package os.services;

import java.util.List;
import java.util.Optional;

import os.model.System;

public interface SystemService {

	List<System> findAllSystem();
	Optional<System> findById(Long id);
	System saveSystem(System system);
	System updateSystem(System system);
	void deleteSystem(Long id);
}
