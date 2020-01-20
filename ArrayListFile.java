package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFile implements Serializable {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int userChoice = 0;
		Scanner sc = new Scanner(System.in);
		double sum = 0;// must be outside the loop, otherwise it returns to zero
						// each time
		do {
			System.out.println("choose a number: 1-9");

			userChoice = sc.nextInt();

			switch (userChoice) {

			case 1:
				numbers.add((int) (Math.random() * 10 + 1));
				System.out.println("a new number was just added to the list ");
				break;
			case 2:
				System.out.println("my current list looks like that: "
						+ numbers);
				break;
			case 3: {
				try (FileOutputStream fos = new FileOutputStream(
						"C:\\TestsF\\list.txt");
						ObjectOutputStream obs = new ObjectOutputStream(fos)) {
					obs.writeObject(numbers);
					System.out.println("theres a new list inside the file");

				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
				break;
			case 4: {// about the list overriding//?//if i choose this before
						// 3-shows thw historic list
				try (FileInputStream fis = new FileInputStream(
						"C:\\TestsF\\list.txt");
						ObjectInputStream ois = new ObjectInputStream(fis)) {
					// @SuppressWarnings("unchecked")//whats that?
					//numbers = (ArrayList<Integer>) ois.readObject();
					ArrayList<Integer> nums=(ArrayList<Integer>) ois.readObject();
					
					System.out.println("list is read from file");
					System.out.println(numbers);// might not yet written
					// System.out.println(nums);//correct one

				} catch (FileNotFoundException | ClassNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());

				}

				/*
				 * try (FileOutputStream fos = new FileOutputStream(
				 * "C:\\TestsF\\list.txt"); ObjectOutputStream oos = new
				 * ObjectOutputStream(fos)) { oos.writeObject(numbers);
				 * System.out.println("theres a list inside the file");
				 * 
				 * } catch (FileNotFoundException ex) {
				 * System.out.println(ex.getMessage()); } catch (IOException ex)
				 * { System.out.println(ex.getMessage()); }
				 */

			}
				break;

			case 5: {

				for (Integer integer : numbers) {
					sum += integer;

				}
				System.out.println("sum of numbers in my list : " + sum);
			}
				break;
			case 6: {
				for (Integer integer : numbers) {// why cant i use the above

					sum += integer;
				}
				System.out.println("test sum : " + sum);
				double avg = sum / numbers.size();
				System.out.println("avg of numbers in my list: " + avg);

			}
				break;
			case 7: {
				System.out.println("thanks for participating");
			}
			}

		} while (userChoice != 7);
		sc.close();
	}
}