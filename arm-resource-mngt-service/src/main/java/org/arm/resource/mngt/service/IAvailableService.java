package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.entity.Available;
import org.arm.resource.mngt.entity.Resource;

public interface IAvailableService {
	
	public List<Available> getAll();
	
    //public List<Resource> getDuration();

}
