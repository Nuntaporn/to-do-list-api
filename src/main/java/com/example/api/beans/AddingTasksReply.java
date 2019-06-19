package com.example.api.beans;

public class AddingTasksReply {
	
	String taskName;
	String taskDetail;
	String taskStatus;
	String statusReply;
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskDetail() {
		return taskDetail;
	}
	
	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}
	
	public String getTaskStatus() {
		return taskStatus;
	}
	
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	public String getStatusReply() {
		return statusReply;
	}
	
	public void setStatusReply(String statusReply) {
		this.statusReply = statusReply;
	}
	

}
