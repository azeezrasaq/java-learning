package complexjavaobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonMain extends Person {

	static int choiceEntry = -1;
	static List<Person> list;
	static Scanner printout;
	static Integer minValue = 1;
	static Integer maxValue = 5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		list = new ArrayList<Person>();
		printout = new Scanner(System.in);
		while (choiceEntry != maxValue) {
			printOptions();
		}
	}

	public static void printOptions() {

		System.out.println("***Select one of the following options**");
		System.out.println("**1**, Add New User");
		System.out.println("**2**, Display User");
		System.out.println("**3**, Find User By First Name");
		System.out.println("**4**, Update Company Details");
		System.out.println("**5**, Exit the Program");
		while (choiceEntry < minValue || choiceEntry > maxValue) {

			System.out.println("Please Enter between " + minValue.toString()
					+ " - " + maxValue.toString() + ", ");

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
			printout.nextLine();

			System.out.print("Please Find user By First Name:  ");
			String firstnam = printout.nextLine();

			for (Person persnn : list) {
				if (persnn.getFirstName().equals(firstnam)) {

					System.out.println(list);

				} else {
					System.out.println("The name cannot be found");

				}
			}
			break;
		case 4:

			printout.nextLine();

			for (Person perss : list) {

				perss.getAddress().setCompany(
						ChangeAddressSpecifiedCompnayDetail());

				System.out.println(list);
				printout.nextLine();
				break;
			}
		case 5:

			System.out.println("Exit program: ");
		default:
			System.out.print("You typed wrong.");
			break;
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
		printout.nextLine();
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

	public static Company ChangeAddressSpecifiedCompnayDetail() {
		Company company = new Company();
		System.out.print("Please Enter Your New Company Name: ");
		company.setCompanyName(printout.nextLine());

		System.out.print("Please Enter Your New Company Website: ");
		company.setCompanyWebsite(printout.nextLine());

		return company;
	}
}
