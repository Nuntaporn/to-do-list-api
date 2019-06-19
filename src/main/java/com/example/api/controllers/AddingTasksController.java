package com.example.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.AddingTasksReply;
import com.example.api.beans.Task;

@RestController
public class AddingTasksController {
	
	@RequestMapping(method = RequestMethod.POST, value="/Adding/task")
	
	  @ResponseBody
	  public AddingTasksReply addingTask(@RequestBody Task task) {
			System.out.println("In registerStudent");
			AddingTasksReply addReply = new AddingTasksReply();           
	        AddingTasks.getInstance().add(task);
	        //We are setting the below value just to reply a message back to the caller
	        addReply.setTaskName(task.getTaskName());
	        addReply.setTaskDetail(task.getTaskDetail());
	        addReply.setTaskStatus(task.getTaskStatus());
	        addReply.setStatusReply("Successful");
	        return addReply;
	}

}
