package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.repository.RepourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceService implements IResourceService{
	
	@Autowired
	private RepourceRepository repourceRepository;

	@Override
	public void save(Resource resource) {
		// TODO Auto-generated method stub
		repourceRepository.save(resource);
	}

	public List<Resource> findAll() {
	    List<Resource> resourceList=repourceRepository.findAll();
		if(resourceList.isEmpty())
			throw new RuntimeException("Resource Not Available.. ");
		return resourceList;
	}

	@Override
	public List<Resource> findResourceWithoutTaskAssigned() {
		
		List<Resource> allResource= repourceRepository.getResourceWithoutTaskAssigned();
		if(allResource.isEmpty())
			throw new RuntimeException("no resource Available.. ");
		return allResource;
	}

	

	
}
