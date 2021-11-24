package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ResourceService implements IResourceService {

	@Autowired
	private ResourceRepository resourceRepository;

	@Override
	public String addResource(Resource resource) {
		resourceRepository.save(resource);
		return "Resource Added";
	}

	@Override
	public String updateResource(Resource resource) {
		resourceRepository.save(resource);
		return "Resource updated";
	}

	@Override
	public String deleteResource(int resourceId) {
		resourceRepository.deleteById(resourceId);
		return "Deleted Successfully";
	}

	@Override
	public Resource getById(int resourceId) {
		return resourceRepository.findById(resourceId).get();
	}

	@Override
	public List<Resource> getAll() {
		return resourceRepository.findAll();
	}

	@Override
	public List<Resource> getAvailability(String availability) {
		return resourceRepository.findAvailability(availability);
	}
	
//	@Override
//	public List<Resource> getResourceById(int resourceId) {
//		return resourceRepository.findResourceById(resourceId);
//	}

}
