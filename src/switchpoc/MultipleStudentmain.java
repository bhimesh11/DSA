package switchpoc;

import java.util.*;

public class MultipleStudentmain {

	private static final Scanner sc = new Scanner(System.in);
	private static final List<multiplestudent> students = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n--- Student Management Menu ---");
			System.out.println("1. Add Student");
			System.out.println("2. Enter Exam Marks");
			System.out.println("3. Calculate Grade");
			System.out.println("4. Print Report Card");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1 -> addStudent();
			case 2 -> enterMarks();
			case 3 -> calculateGrade();
			case 4 -> printRepotCard();
			case 5 -> {
				System.out.println("Exiting");
				return;
			}
			default -> System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private static void printRepotCard() {
		multiplestudent student = findStudent();
		if (student == null) {
			return;
		}

		student.printReportCard();
	}

	private static void calculateGrade() {
		multiplestudent student = findStudent();
		if (student == null) {
			return;
		}
		System.out.print("Enter exam name to calculate grade: ");
		String exam = sc.nextLine();
		student.calculateGrade(exam);
		System.out.println("Grade calculated for " + exam + ".");
	}

	private static void enterMarks() {
		multiplestudent student = findStudent();
		if (student == null) {
			return;
		}
		System.out.print("Enter exam name (Quarterly/Half-Yearly/Annual): ");
		String exam = sc.nextLine();
		int[] marks = new int[7];
		String[] subjects = { "Telugu", "Hindi", "English", "Maths", "Science", "Biology", "Social" };
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("Enter marks for " + subjects[i] + ": ");
			marks[i] = sc.nextInt();
		}
		sc.nextLine();
		student.enterMarks(exam, marks);
		System.out.println("Marks entered successfully.");
	}

	private static multiplestudent findStudent() {
		System.out.print("Enter student name: ");
		String name = sc.nextLine();
		for (multiplestudent student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				return student;
			}
		}
		System.out.println("Student not found.");
		return null;
	}

	private static void addStudent() {
		System.out.print("Enter student name: ");
		String name = sc.nextLine();
		System.out.print("Enter class: ");
		int standard = sc.nextInt();
		System.out.print("Enter section (A/B/C): ");
		char section = sc.next().charAt(0);
		students.add(new multiplestudent(name, standard, section));
		System.out.println("Student added successfully.");
	}

}
