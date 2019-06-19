package com.example.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;
import com.example.api.beans.Task;

@RestController
public class TaskRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/task/alltask")
	  @ResponseBody
	  public List<Task> getAllTasks() {
	  return AddingTasks.getInstance().getTaskRecords();
	  }

}
