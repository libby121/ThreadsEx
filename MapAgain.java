package collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapAgain {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter your dog's name");
		String text= sc.nextLine();
		HashMap<Character, Integer>letters= new HashMap<Character, Integer>();
		
		for (int i = 0; i < text.length(); i++) {
			char tav=text.charAt(i);
			if (letters.containsKey((tav))){
				letters.put(tav, letters.get(tav)+1);
				
			}
			else letters.put(tav, 1);
		}
	
	System.out.println(letters);
	
	for (Character letter : letters.keySet()) {
		System.out.println(letter);
	}
	}

}
