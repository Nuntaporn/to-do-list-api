package com.example.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

@RestController
public class FoundTaskController {
	
	@RequestMapping(method = RequestMethod.GET, value="/task/{taskName}")
	  @ResponseBody
	  public List<Task> getTask(@PathVariable("taskName") String taskName) {
	  return AddingTasks.getInstance().foundTask(taskName);
	  }

}
