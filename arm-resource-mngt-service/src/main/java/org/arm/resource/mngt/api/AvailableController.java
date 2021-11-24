package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Available;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.service.IAvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvailableController {
	@Autowired
	private IAvailableService availableService;

	
	@GetMapping("/available")
	public List<Available> findAll(){
		return availableService.getAll();
	}
//	
//	@GetMapping("/availables")
//	public List<Resource> findDuration(){
//		return availableService.getDuration();
//	}
}
