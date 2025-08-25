package switchpoc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class multiplestudent {

	private String name;
	private int standard;
	private char section;
	private Map<String, int[]> examMarks = new HashMap<>();
	private Map<String, Character> examGrades = new HashMap<>();
	private boolean promoted;

	private static final String[] SUBJECTS = { "Telugu", "Hindi", "English", "Maths", "Science", "Biology", "Social" };
	private static final String[] EXAMS = { "Quarterly", "Half-Yearly", "Annual" };

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public multiplestudent(String name, int standard, char section) {
		super();
		this.name = name;
		this.standard = standard;
		this.section = section;
	}

	public void enterMarks(String exam, int[] marks) {
		examMarks.put(exam, marks);
	}

	public void calculateGrade(String exam) {
		int[] marks = examMarks.get(exam);
		int total = Arrays.stream(marks).sum();
		int avg = total / SUBJECTS.length;
		char grade;
		System.out.println(avg);
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 75) {
			grade = 'B';
		} else if (avg >= 60) {
			grade = 'C';
		} else if (avg >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		examGrades.put(exam, grade);
		if ("Annual".equals(exam)) {
			if (grade != 'F') {
				promoted = true;
			}
			if (promoted) {
				standard++;
			} else {
				System.out.println("Student should retake standard course again");
			}

		}
	}

	public void printReportCard() {
		System.out.println("----- Report Card -----");
		System.out.println("Name    : " + name);
		System.out.println("Class   : " + standard);
		System.out.println("Section : " + section);
		for (String exam : EXAMS) {
			System.out.println("Exam: " + exam);
			if (examMarks.containsKey(exam)) {
				int[] marks = examMarks.get(exam);
				for (int i = 0; i < marks.length; i++) {

					System.out.println("  " + SUBJECTS[i] + ": " + marks[i]);
				}
				System.out.println("  Grade: " + examGrades.getOrDefault(exam, '-'));
			} else {
				System.out.println("No Marks enterd");
			}
			if ("Annual".equals(exam)) {
				System.out.println("Promoted to next class: " + (promoted ? "Yes" : "No"));
				System.out.println("------------------------");
			}
		}
	}

}
