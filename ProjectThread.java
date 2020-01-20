package projectEx;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class ProjectThread implements Runnable {

	private ArrayList<Project> projects;

	public ProjectThread(ArrayList<Project> projects) {

		this.projects = projects;
	}

	public void TimePlan(Project pr) {

		long start = pr.getStartDate().getTimeInMillis();
		long end = pr.getEndDate().getTimeInMillis();
		long time = (end - start);
		int startYear = pr.getStartDate().get(Calendar.YEAR);
		int endYear = pr.getEndDate().get(Calendar.YEAR);

		System.out.println();
		int startMonth = pr.getStartDate().get(Calendar.MONTH);
		int endMonth = pr.getEndDate().get(Calendar.MONTH);

		long diffMinutes = time / (60_000) % 60;
		long diffHours = time / (60_000 * 60) % 24;
		long diffDays = time / (60_000 * 60 * 24)% 365;
		long diffYear=time/(60_000 * 60 *24*365)%12;
		//int diffYear = endYear - startYear;
		int diffMonth =Math.abs( endMonth - startMonth) ;

		// long diffMonths= time/ (60_000 * 60 * 24*Calendar.);
		// System.out.println("project : " + pr.getName() + " lasts : "
		// +diffYear+" years, "+diffMonth+" months, "+
		// diffDays + " days, " + diffHours + " hours,  "
		// + diffMinutes + " minutes");
		// }
		System.out.println("project : " + pr.getName() + " lasts : " + diffYear+ " years " +diffDays
				+ " days, " + diffMonth+"months"+diffHours + " hours,  " + diffMinutes
				+ " minutes ");
	}

	public void run() {

		while (true) {

			for (Project pr : projects) {
				TimePlan(pr);
			}

			// long time2=time2.between(end,start);
			// System.out.println("project: "+pr.getName()+" lasts : "+(time<=(60_000)?diffMinutes+" minutes"
			// :
			// time<=86_400_000? diffHours+"hours"+diffMinutes: ));

			try {
				Thread.sleep(6000 * 10);
			} catch (InterruptedException e) {
				System.out.println("still tired..");
			}
		}
	}
}
