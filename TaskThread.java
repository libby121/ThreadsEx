package tasks;

import java.util.ArrayList;
import java.util.Calendar;

public class TaskThread extends Thread {

	private ArrayList<Task> list;//regular class..

	public TaskThread(ArrayList<Task> list) {//outside the run

		this.list = list;
	}

//	@Override
//	public void run() {
//
//		while (true) {
//			while (true) {
//				Calendar cal = Calendar.getInstance();
//				for (int i = 0; i < list.size(); i++) {
//					if (cal.get(Calendar.MINUTE) > list.get(i).getMinute()) {
//						System.out.println("a minute late for : "
//								+ list.get(i).getTask());
//					}
//
//				}
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					System.out.println("dont wake me up again");
//				}
//			}
//
//		}
	@Override
	public void run() {
	
		while(true){
			Calendar cal = Calendar.getInstance();//why should it be inside while

			for (Task task : list) {//no need ArrayList<>?
			if(task.getDueDate().before(cal)){	//why do i dont need getTime//cant i use <>?//if it isnt now-meed set
				System.out.println(task.getTask()+" task is overDue.. ");
			}
			
			}		
		try {
			Thread.sleep(1000*60);
		} catch (InterruptedException e) {
		System.out.println("still tired..");
		}	
		}
	
	}
}
