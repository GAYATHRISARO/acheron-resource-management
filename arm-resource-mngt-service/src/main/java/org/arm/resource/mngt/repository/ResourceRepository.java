package org.arm.resource.mngt.repository;

import java.util.List;

import org.arm.resource.mngt.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

//	@Query("from Task t inner join t.resource r where r.resourceId=?1")
//	public List<Resource> findResourceById(int resourceId);
	
	@Query("from Resource where availability=?1")
	List<Resource> findAvailability(String availability);

}
