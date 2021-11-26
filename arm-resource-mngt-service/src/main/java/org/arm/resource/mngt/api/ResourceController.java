package org.arm.resource.mngt.api;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.arm.resource.mngt.entity.Campaign;
import org.arm.resource.mngt.entity.Resource;
import org.arm.resource.mngt.service.ResourceService;
import org.arm.resource.mngt.vo.ResourceMapper;
import org.arm.resource.mngt.vo.ResourceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@Autowired
	private ResourceService resourceService;
	
	@GetMapping("/resource/list")
	public List<Resource> getResources(){
		return resourceService.findAll();
	}
	
//	@GetMapping("/resource/resurces")
//	public List<Resource> getAllResources(){
//		return resourceService.;
//	}
//	@GetMapping("/resources")
//	ResponseEntity<List<ResourceVO>> getAllResource() {
//				List<ResourceVO> resourceVO = new ArrayList<ResourceVO>();
//				List<Resource> allResource = resourceService.findAll();
//				HttpHeaders headers = new HttpHeaders();
//				headers.add("desc", "Get");
//				for (Resource resource : allResource) {
//					ResourceMapper mapper = ResourceMapper.INSTANCE;
//					ResourceVO vo = mapper.fromResource(resource);
//					//ResourceVO.add(vo);
//				}
//				return ResponseEntity.status(HttpStatus.OK).headers(headers).body(resourceVO);
//			}
	
//	@GetMapping("/campaign")
//	ResponseEntity<List<CampaignVO>> getCampaign() {
//		List<CampaignVO> campaignVO = new ArrayList<CampaignVO>();
//		List<Campaign> allCampaign = campaignService.getAllCampaign();
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("desc", "Get");
//		for (Campaign campaign : allCampaign) {
//			CampaignMapper mapper = CampaignMapper.INSTANCE;
//			CampaignVO vo = mapper.fromCampaign(campaign);
//			campaignVO.add(vo);
//		}
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(campaignVO);
//	}
	@PostMapping("/resource/create")
	public void createResource(){
		Resource resource = new Resource();
		//resource.setAvailablility("Available");
		resource.setCreateDate(new Timestamp(new Date().getTime()));
		resource.setIsDeleted(0);
		resource.setResourceName("T User 2");
		resource.setResourceType("B");
		
		resourceService.save(resource);
	}
	
	@GetMapping("/resource")
	public List<Resource> getResourceWithoutTaskAssigned(){
		return resourceService.findResourceWithoutTaskAssigned();
	}
	
	
} 
