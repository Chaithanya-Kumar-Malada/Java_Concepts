package Branching_IF_ELSE_SWITCH;
import java.util.*;
public class StudentsGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Marks :");
		int marks = sc.nextInt();
		
		if(marks>90) {
			System.out.println(" Student Grade is 'S' ");
		}else if (marks>=81){
			System.out.println(" Student Grade is 'A' ");
		}else if(marks>=71) {
			System.out.println(" Student Grade is 'B' ");
		}else if(marks>=61) {
			System.out.println(" Student Grade is 'C' ");
		}else if(marks>=51) {
			System.out.println(" Student Grade is 'D' ");
		}else {
			System.out.println(" Student Grade is 'RA' ");
		}
		
		
	}
}
