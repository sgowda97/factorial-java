package factorial.recursive;

import java.util.Scanner;

public class FactorialNumber {

	static int factorialNumber(int num) {
		if(num == 0)
			return 1;
		else
			return(num * factorialNumber(num-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, fact = 1;
		
		System.out.println("Enter the number to find the factorial for:");
		number = sc.nextInt();
		
		fact = factorialNumber(number);
		
		System.out.println("The factorial of the number "+number+" is"+fact);
		
		sc.close();
	}
}
