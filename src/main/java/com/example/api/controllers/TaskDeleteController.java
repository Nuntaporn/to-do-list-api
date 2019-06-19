package com.example.api.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.beans.AddingTasks;

@RestController
public class TaskDeleteController {
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/task/{tname}")
	
	@ResponseBody
	public String deleteTaskRecord(@PathVariable("tname") String tname) {
		System.out.println("In deleteStudentRecord");   
	    return AddingTasks.getInstance().deleteTask(tname);
	}

}
