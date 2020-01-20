package threadsHW3;

import java.util.Calendar;
import java.util.HashSet;

public class CalendarThread extends Thread {

	private Calendar cal = Calendar.getInstance();

	//	public CalendarThread(Calendar cal) {
	//		super();
	//		this.cal = cal;
	//	}

	public Calendar getCal() {
		return cal;
	}
int count=0;
HashSet<Integer>calendar= new HashSet<Integer>();
	@Override
	public void run() {
		while(calendar.size()<31){
			int rand = (int)(Math.random()*30+1);//make a hashset instead
		
			cal.set(Calendar.DAY_OF_MONTH, rand);
			calendar.add(rand);
			System.out.println("day added: "+ rand);
			count++;
			System.out.println(cal.getTime());

			try {
				Thread.sleep((int)(Math.random()*5001+1000));
			} catch (InterruptedException e) {
				System.out.println("still tired...!!");
			}

		}



	}
}