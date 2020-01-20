package tasks;

import java.util.Calendar;

public class Task {

	private String task;
	
	private Calendar DueDate;//a variable of type calendar? no need to call getInstance method here?sees it as a calendar class immediately?
	

	public Task(String task, Calendar dueDate) {
		
		this.task = task;
		DueDate = dueDate;//?
		
		DueDate.getInstance();
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
//	
//	public Calendar getDueTime(){
//		return Calendar.getInstance()
//;	}
//	
//	public int getHour(){
//		return Calendar.HOUR;
//	}
//
//	public int getMinute(){
//		return Calendar.MINUTE;
//	}

	public Calendar getDueDate() {
		return DueDate;
	}

	public void setDueDate(Calendar dueDate) {
		DueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task [task=" + task + ", DueDate=" + DueDate.getTime() + "]";//getTime- calls the current time?
	}
	
	
	
}
