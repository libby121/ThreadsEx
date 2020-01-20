package projectEx;

import java.util.Calendar;

public class Project {
	
	private String name;
	private int numTasks;
	private Calendar startDate;
	private Calendar endDate;

	
	public Project(String name, Calendar startDate,
			Calendar endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		numTasks=3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumTasks() {
		return numTasks;
	}


	public void setNumTasks(int numTasks) {
		this.numTasks = numTasks;
	}


	public Calendar getStartDate() {
		return startDate;
	}


	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}


	public Calendar getEndDate() {
		return endDate;
	}


	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	
	public void addTask(int minutes){
		endDate.add(Calendar.MINUTE, minutes);//another way?

		numTasks++;
		
	}


	@Override
	public String toString() {
		return "Project [name=" + name + ", numTasks=" + numTasks
				+ ", startDate=" + startDate.getTime() + ", endDate=" + endDate.getTime()+ "]";
	}

}
