package com.example.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

@RestController
public class SetTaskStatusController {
	
@RequestMapping(method = RequestMethod.PUT, value="/setstatus/task")
	
	@ResponseBody
	public String updateTaskRecord(@RequestBody Task task) {
		System.out.println("In updateStatus");   
	    return AddingTasks.getInstance().setStatus(task);
	}

}
