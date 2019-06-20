package com.example.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

/**
 * The Class FoundTaskController.
 */
@RestController
public class FoundTaskController {
	
	/**
	 * Gets the task by task name.
	 *
	 * @param taskName the task name
	 * @return the task
	 */
	@RequestMapping(method = RequestMethod.GET, value="/task/{taskName}")
	  @ResponseBody
	  public List<Task> getTask(@PathVariable("taskName") String taskName) {
	  return AddingTasks.getInstance().foundTask(taskName);
	  }

}
