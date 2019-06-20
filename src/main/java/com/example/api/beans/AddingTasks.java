package com.example.api.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class AddingTasks.
 */
public class AddingTasks {
	
/** The task records. */
private List<Task> taskRecords;
	
	/** The task add. */
	private static AddingTasks taskAdd = null;
	
	/**
	 * Instantiates a new adding tasks.
	 */
	private AddingTasks() {
		taskRecords = new ArrayList<Task>();
	}
	
	/**
	 * Gets the single instance of AddingTasks.
	 *
	 * @return single instance of AddingTasks
	 */
	public static AddingTasks getInstance() {
        if(taskAdd == null) {
        	taskAdd = new AddingTasks();
              return taskAdd;
            }
            else {
                return taskAdd;
            }
    }
	
	/**
	 * Adds the.
	 *
	 * @param tak the task
	 */
	public void add(Task task) {
		taskRecords.add(task);
	}
	
	/**
	 * Update task.
	 *
	 * @param task the task
	 * @return the string
	 */
	public String updateTask(Task task) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task taskOjb = taskRecords.get(i);
		            if(taskOjb.getTaskName().equals(task.getTaskName())) {
		            	taskRecords.set(i, task);
		              return "Update successful";
		            }
		        }
		return "Update un-successful";
	}
	
	/**
	 * Delete task.
	 *
	 * @param taskName the task name
	 * @return the string
	 */
	public String deleteTask(String taskName) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task task = taskRecords.get(i);
		            if(task.getTaskName().equals(taskName)){
		            	taskRecords.remove(i); 
		              return "Delete successful";
		            }
		        }
		return "Delete un-successful";
	}
	
	/**
	 * Found task.
	 *
	 * @param taskName the task name
	 * @return the list
	 */
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
	
	/**
	 * Gets the task records.
	 *
	 * @return the task records
	 */
	public List<Task> getTaskRecords() {
	    return taskRecords;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param tak the task
	 * @return the string
	 */
	public String setStatus(Task task) {
		for(int i=0; i<taskRecords.size(); i++)
		        {
			Task taskOjb = taskRecords.get(i);
		            if(taskOjb.getTaskName().equals(task.getTaskName())) {
		            	taskRecords.set(i, task);
		              return "Set Task Status successful";
		            }
		        }
		return "Set Task Status un-successful";
	}


}
