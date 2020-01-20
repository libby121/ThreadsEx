package projectEx;

import java.util.Calendar;

public class Temp {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,2021);
		cal.set(Calendar.MONTH,4);
		cal.set(Calendar.DATE, 21);
		cal.set(Calendar.HOUR_OF_DAY, 12);
		cal.set(Calendar.MINUTE, 35);
		
		int endYear = cal.get(Calendar.YEAR);
		
		System.out.println(endYear);

	}

}
