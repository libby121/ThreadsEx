package tasks;

import java.util.ArrayList;
import java.util.Calendar;

public class Program {
	


	public static void main(String[] args) {
		
	//	Calendar cal = Calendar.getInstance();//automatically shows the current time.
//		//singleton static method. i dont create a new one. do i need it each time i call calendar?
//		System.out.println(cal.getTime());
//		cal.set(Calendar.MONTH, Calendar.MARCH);//constant
//		System.out.println(cal.getTime());
//		cal.set(Calendar.DAY_OF_MONTH,20);;//constant?
//		System.out.println(cal.getTime());;//presents the last cal i created
//		ArrayList<Task>tasks = new ArrayList<Task>();
//		
		//tasks.add(new Task("feed the fish", cal.get(Calendar.MINUTE)));
		
		ArrayList<Task>ToDoList=new ArrayList<Task>();
	
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.MINUTE, 36);//is there another easier way instead of setting the current time
		ToDoList.add(new Task("feed the fish", calendar));
		
		Calendar cal2=Calendar.getInstance();
		cal2.set(Calendar.MINUTE, 34);
		ToDoList.add(new Task("drink a glass of water", cal2));
		
		Calendar cal3=Calendar.getInstance();
		cal3.set(Calendar.MINUTE, 37);
		ToDoList.add(new Task("do the laundry", cal3));
		
		
		TaskThread td= new TaskThread(ToDoList);
		
		td.start();
		
	}

}
