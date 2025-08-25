package switchpoc;

public class student {

	private String name;
	private int[] marks = new int[6];
	private char grade;

	public student(String name) {
		this.name = name;
		this.marks = new int[6];
	}
	public student() {
	}

	public void enterMarks(int[] newMarks) {
		this.marks = newMarks;
	}

	public void calculateGrade() {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		System.out.println(total);
		int avg = total / marks.length;
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
	}

	public void printReportCard() {
		System.out.println("---- Report Card ----");
		System.out.println("Name: " + name);
		System.out.println("Marks: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + ": " + marks[i]);
		}
		System.out.println("Grade " + grade);
		System.out.println("----------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	
}
