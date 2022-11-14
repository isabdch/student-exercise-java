package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		double maxGrade = 100.00;
		double minGrade = (60 * maxGrade) / 100;
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("First trimester grade: ");
		student.gradeFirstTrimester = sc.nextDouble();
		
		System.out.print("Second trimester grade: ");
		student.gradeSecondTrimester = sc.nextDouble();
		
		System.out.print("Third trimester grade: ");
		student.gradeThirdTrimester = sc.nextDouble();
		
		if (student.finalGrade() >= minGrade) {
			System.out.printf("%nFINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("PASSED");
		} else {
			System.out.printf("%nFINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", minGrade - student.finalGrade());
		}
		
		sc.close();
	}

}
