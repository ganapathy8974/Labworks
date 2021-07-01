package week2.part1;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		double grade;
		double sumOfGrades=0;
		int numStudents=0;
		int numPass=0;
		int numFail=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("\nGrade Processing Program\n");
		
		System.out.println("Enter the first student's grade: ");
		grade = scan.nextDouble();
		
		while(grade>=0) {
			sumOfGrades=sumOfGrades+grade;
			numStudents=numStudents+1;
			if(grade<60) {
				numFail=numFail+1;
			}				
			else {
				numPass=numPass+1;
				System.out.println("Enter the next grade(a negative to quit): ");
				grade = scan.nextDouble();
			}				
		}
		scan.close();
		
		if(numStudents>0) {
			System.out.println("\nGrad Summary: ");
			System.out.println("Class Average: "+sumOfGrades/numStudents);
			System.out.println("Number of Passing Grades: "+numPass);
			System.out.println("Number of Failing Grades: "+numFail);
		}
		else {
			System.out.println("No grades processed.");
		}		
	}

}
