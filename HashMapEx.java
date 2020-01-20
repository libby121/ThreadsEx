package collections;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, String> customers = new HashMap<String, String>();

		customers.put("1111", "libby");
		customers.put("2222", "Ben");
		customers.put("3333", "Dan");
		customers.put("4444", "Shai");

		System.out.println(customers);

		customers.put("$%$%%$%", "Gal");
		System.out.println(customers);
		System.out.println(customers.keySet());
		
		System.out.println(customers.containsKey("1111"));
		System.out.println(customers.containsValue("Ron"));

		System.out.println(customers.get("2222"));//get=by the key

		for (String string : customers.keySet()) {// run through the keys. why not only customers
			System.out.println(customers.get(string)+ ": id num ="+ string//according to each key- bring me its value.get value per key
					 );

		}

	}

}
