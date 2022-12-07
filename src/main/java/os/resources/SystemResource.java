package os.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import os.domain.System;
import os.services.SystemService;

@RestController
@RequestMapping(value = "/system")
public class SystemResource {

	@Autowired
	private SystemService systemService;
	
	public SystemResource(SystemService systemService) {
		this.systemService = systemService;
	}

	/*
	 * List System
	 */
	@GetMapping
	public List<System> findAllSystem() {
		return systemService.findAllSystem();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<System> findById(@PathVariable("id") Long id) {
		return systemService.findById(id);
	}

	/*
	 * Create System
	 */
	@PostMapping
	public System createSystem(@RequestBody System system) {
		return systemService.saveSystem(system);
	}

	/*
	 * Edit System
	 */
	@PutMapping
	public System update(@RequestBody System system) {
		return systemService.saveSystem(system);
	}
	
	/*
	 * Delete System
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteSystem(@PathVariable("id") Long id) {
		systemService.deleteSystem(id);
	}
}
