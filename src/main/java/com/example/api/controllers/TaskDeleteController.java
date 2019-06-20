package com.example.api.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;

/**
 * The Class TaskDeleteController.
 */
@RestController
public class TaskDeleteController {
	
	/**
	 * Delete task record.
	 *
	 * @param tname the task name
	 * @return the string
	 */
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/task/{tname}")
	
	@ResponseBody
	public String deleteTaskRecord(@PathVariable("tname") String tname) {
		System.out.println("In deleteTask");   
	    return AddingTasks.getInstance().deleteTask(tname);
	}

}
