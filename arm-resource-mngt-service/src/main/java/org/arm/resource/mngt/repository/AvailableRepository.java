package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.entity.Available;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableRepository extends JpaRepository<Available, Integer> {

	//@Query("from Available a inner join a.resource r where r.startDate=?1 - r.endDate=?2")
//	List<Resource> findDuration();

}
