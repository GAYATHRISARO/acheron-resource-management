package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Available;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.repository.AvailableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AvailableService implements IAvailableService {
	@Autowired
	AvailableRepository availableRepository;

	@Override
	public List<Available> getAll() {
		return availableRepository.findAll();
	}

//	@Override
//	public List<Resource> getDuration() {
//		return availableRepository.findDuration();
//	}



	

	

}
