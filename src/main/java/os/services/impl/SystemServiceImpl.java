package os.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import os.model.System;
import os.repositories.SystemRepository;
import os.services.SystemService;

@Service
public class SystemServiceImpl implements SystemService{

	private final SystemRepository systemRepository;
	
	public SystemServiceImpl(SystemRepository systemRepository) {
		this.systemRepository = systemRepository;
	}

	@Override
	public List<System> findAllSystem() {
		return systemRepository.findAll();
	}

	@Override
	public Optional<System> findById(Long id) {
		return systemRepository.findById(id);
	}

	@Override
	public System saveSystem(System system) {
		return systemRepository.save(system);
	}

	@Override
	public System updateSystem(System system) {
		return systemRepository.save(system);
	}

	@Override
	public void deleteSystem(Long id) {
		systemRepository.deleteById(id);
	}
	
	
}
