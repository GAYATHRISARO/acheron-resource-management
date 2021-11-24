package org.arm.resource.mngt.api;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@Autowired
	private IResourceService resourceService;
//	
//	@GetMapping("/resource/resourceId/{resourceId}")
//	List<Resource> findResourceById(@PathVariable("resourceId")int resourceId){
//		return resourceService.getResourceById(resourceId);
//	}
	@GetMapping("/resource")
	public List<Resource> getAll(){
		resourceService.getAll().forEach(System.out:: println);
		return resourceService.getAll();
	}

	@GetMapping("/resource/availability/{availability}")
	public List<Resource> getAvailability(String availability){
		resourceService.getAvailability(availability).forEach(System.out:: println);
		return resourceService.getAvailability(availability);
	}
}
