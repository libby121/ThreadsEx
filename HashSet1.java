package collections;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet<String>texts1 = new HashSet<String>();
		HashSet<String>texts2 = new HashSet<String>();
		
		texts1.add("SUN");
		texts1.add("MOON");
		texts1.add("STAR");
		texts1.add("WIND");
		texts1.add("EARTH");
		texts2.add("STAR");
		texts2.add("RAIN");
		texts2.add("SUN");
		
		System.out.println(texts1);
		System.out.println(texts2);
		
		for (String string : texts1) {
			if(texts2.contains(string)){
				System.out.println(string);
				
				
			}
			
		}
		
	}

}
