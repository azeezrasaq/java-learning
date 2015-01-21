package complexjavaobject;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PersonMain extends Person {

	static int choiceEntry = -1;
	static List<Person> list;
	static Scanner printout;
	static Integer minValue = 1;
	static Integer maxValue = 3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list = new ArrayList<Person>();
		printout = new Scanner(System.in);
		while (choiceEntry != maxValue) {
			printOptions();
		}
		// for (int i = 0; i < 2; i++)

		// list.add(addres);
		// list.add(company);

		// Sorting
		// Collections.sort(list, new Comparator<Person>() {
		//
		// @Override
		// public int compare(Person Name, Person lName) {
		//
		// return Name.getLastName().compareTo(lName.getLastName());
		// }
		//
		// });
		// // /((Address) list.get(1)).setCity("Azeez");
		// list.get(i).setFirstName("Azeez");

		// Person obj = iterator.next();
		// listIterator.set(persn);

	}

	public static void printOptions() {

		System.out.println("***Select one of the following options**");
		System.out.println("**1**, Add New User");
		System.out.println("**2**, Find existing User");
		System.out.println("**3**, Exit User");
		while (choiceEntry < minValue || choiceEntry > maxValue) {
			System.out.println("Please Enter between " + minValue.toString()
					+ " - " + maxValue.toString() + ": ");
			choiceEntry = printout.nextInt();
		}
		switch (choiceEntry) {
		case 1:
			Person pern = getNewUser();
			list.add(pern);
			break;
		case 2:
			System.out.println(list);
			break;
		case 3:
			System.out.print("Exit the program");
			break;
		default:
			System.out.print("You typed wrong.");
		}
		choiceEntry = -1;

	}

	public static Integer getIntegerFromConsole(String txt) {

		String optInput = System.console().readLine(txt);

		return Integer.parseInt(optInput);

	}

	public static Person getNewUser() {
		Address addres = new Address();
		Company company = new Company();
		Person persn = new Person();

		System.out.print("Please Enter Your First Name: ");
		persn.setFirstName(printout.nextLine());
		System.out.print("Please Enter Your LastName: ");
		persn.setLastName(printout.nextLine());

		System.out.print("Enter Your Street 1: ");
		addres.setStreet1(printout.nextLine());

		System.out.print("Enter Your Street 2: ");
		addres.setStreet2(printout.nextLine());

		System.out.print("Enter Your City: ");
		addres.setCity(printout.nextLine());

		System.out.print("Enter Your Country: ");
		addres.setCountry(printout.nextLine());

		System.out.print("Please Enter Your Company Name: ");
		company.setCompanyName(printout.nextLine());

		System.out.print("Please Enter Your Company Website: ");
		company.setCompanyWebsite(printout.nextLine());

		addres.setCompany(company);
		persn.setAddress(addres);

		return persn;
	}
}
