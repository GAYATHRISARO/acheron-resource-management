package org.arm.resource.mngt.api;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.arm.resource.mngt.entity.Priority;
import org.arm.resource.mngt.entity.Status;
import org.arm.resource.mngt.entity.Task;
import org.arm.resource.mngt.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@Autowired
	private ITaskService taskService;
	
	@GetMapping("/task")
	public List<Task> allT(){
		return taskService.getAllTask();
	}
	
	@GetMapping("/task/create")
	public void createTask(){
		//List<Task> tasks = new ArrayList<>();
		Task task = new Task();
		task.setCreateDate(new Timestamp(new Date().getTime()));
		task.setDuration(10);
		task.setTaskEndDate(new Timestamp(new Date().getTime() + 15*86400 ));
		task.setTaskStartDate(new Timestamp(new Date().getTime()));
		task.setIsDeleted(0);
		task.setPriority(Priority.MEDIUM);
		//task.setProjectId(1);
		task.setStatus(Status.IN_PROGRESS);
		task.setTaskName("Task5");
		task.setTaskOwner("Test");
		
//		Task task1 = new Task();
//		task1.setCreateDate(new Timestamp(new Date().getTime()));
//		task1.setDuration(10);
//		task1.setEndDate(new Timestamp(new Date().getTime() + 15*86400 ));
//		task1.setStartDate(new Timestamp(new Date().getTime()));
//		task1.setIsDeleted(0);
//		task1.setPriority(Priority.MEDIUM);
//		task1.setProjectId(1);
//		task1.setStatus(Status.IN_PROGRESS);
//		task1.setTaskName("Task2");
//		task1.setTaskOwner("Test");
//	
		taskService.createTasks(task);
		//taskService.createTasks(task1);
	}
	
	@GetMapping("/task/availableHours/{availableHours}")
	ResponseEntity<List<Task>> findByDurationLessThan(@PathVariable("availableHours") float availableHours){
		List<Task> taskList=taskService.getByDurationLessThan(availableHours);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Get Brandlist By Name");
		return ResponseEntity.ok().headers(headers).body(taskList);
	
	}
}
