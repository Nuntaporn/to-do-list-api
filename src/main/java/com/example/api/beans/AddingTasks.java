package com.example.api.beans;

import java.util.ArrayList;
import java.util.List;

public class AddingTasks {
	
private List<Task> taskRecords;
	
	private static AddingTasks taskAdd = null;
	
	private AddingTasks() {
		taskRecords = new ArrayList<Task>();
	}
	
	public static AddingTasks getInstance() {
        if(taskAdd == null) {
        	taskAdd = new AddingTasks();
              return taskAdd;
            }
            else {
                return taskAdd;
            }
    }
	
	public void add(Task tak) {
		taskRecords.add(tak);
	}
	
	public String updateTask(Task tak) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task task = taskRecords.get(i);
		            if(task.getTaskName().equals(tak.getTaskName())) {
		            	taskRecords.set(i, tak);//update the new record
		              return "Update successful";
		            }
		        }
		return "Update un-successful";
	}
	
	public String deleteTask(String taskName) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task task = taskRecords.get(i);
		            if(task.getTaskName().equals(taskName)){
		            	taskRecords.remove(i);//update the new record
		              return "Delete successful";
		            }
		        }
		return "Delete un-successful";
	}
	
	public List<Task> foundTask(String taskName) {
		List<Task> foundTask = new ArrayList<Task>();
		for(int i=0; i<taskRecords.size(); i++) {
			Task task = taskRecords.get(i);
				if(task.getTaskName().equals(taskName)) {
					foundTask.add(task);
					return foundTask;
				}
		}
		return foundTask;
	}
	
	public List<Task> getTaskRecords() {
	    return taskRecords;
	}
	
	public String setStatus(Task tak) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task task = taskRecords.get(i);
		            if(task.getTaskName().equals(tak.getTaskName())) {
		            	taskRecords.set(i, tak);//Set Task Status record
		              return "Set Task Status successful";
		            }
		        }
		return "Set Task Status un-successful";
	}


}
