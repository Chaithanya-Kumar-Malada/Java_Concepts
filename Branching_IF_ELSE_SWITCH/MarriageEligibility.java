package Branching_IF_ELSE_SWITCH;

public class MarriageEligibility {

	public static void main(String[] args) {
		
		int age = 18;
		String gender = "male";
		
		if(gender=="male") {
			if(age >= 21) {
				System.out.println("Male is Eligible for marriage");
			}else {
				System.out.println("Male is NOT Eligible for marriage");
			}
		}else if(gender=="female") {
			if(age>=18) {
				System.out.println("FeMale is Eligible for marriage");
			}else {
				System.out.println("FeMale is NOT Eligible for marriage");
			}
		}else {
			System.out.println("The gender is not male or female ? ");
		}
		

	}

}
