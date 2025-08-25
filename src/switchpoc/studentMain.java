package switchpoc;

import java.util.Scanner;

public class studentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		student student = new student(name);

		int choice;
		do {
			System.out.println("\n---- Student Menu ----");
			System.out.println("1. View Student Details");
			System.out.println("2. Enter Marks");
			System.out.println("3. Calculate Grade");
			System.out.println("4. Print Report Card");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Student Name: " + student.getName());
				break;
			case 2:
				int[] marks = new int[6];
				for (int i = 0; i < marks.length; i++) {
					System.out.print("Enter marks for Subject " + (i + 1) + ": ");
					marks[i] = sc.nextInt();
				}
				student.enterMarks(marks);
				break;
			case 3:
				student.calculateGrade();
				System.out.println("Grade calculated successfully");
				break;
			case 4:
				student.printReportCard();
				System.out.println("Grade calculated successfully.");
				break;
			case 5:
				System.out.println("Exiting.....Thank you");
				break;

			default:
				System.out.println("Invalid choice...Try again");
			}
		} while (choice != 5);

		sc.close();
	}

}
