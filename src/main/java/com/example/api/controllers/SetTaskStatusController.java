package com.example.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

/**
 * The Class SetTaskStatusController.
 */
@RestController
public class SetTaskStatusController {
	
/**
 * Update task record.
 *
 * @param task the task
 * @return the string
 */
@RequestMapping(method = RequestMethod.PUT, value="/setstatus/task")
	
	@ResponseBody
	public String updateTaskRecord(@RequestBody Task task) {
		System.out.println("In updateStatus");   
	    return AddingTasks.getInstance().setStatus(task);
	}

}
