package collections;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Integer>intim= new HashSet<Integer>();
		
		while(intim.size()<10) {
			intim.add((int)(Math.random()*24));
			
			
		}
		System.out.println(intim);
	
		int count=0;
		
		for (Integer integer : intim) {
			if(integer<10){
				count++;
			}	
		}
			System.out.println(count);
		
	}
}
