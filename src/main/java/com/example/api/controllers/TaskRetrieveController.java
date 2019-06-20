package com.example.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

/**
 * The Class TaskRetrieveController.
 */
@RestController
public class TaskRetrieveController {
	
	/**
	 * Gets the all tasks list.
	 *
	 * @return the all tasks list
	 */
	@RequestMapping(method = RequestMethod.GET, value="/task/alltask")
	  @ResponseBody
	  public List<Task> getAllTasks() {
	  return AddingTasks.getInstance().getTaskRecords();
	  }

}
