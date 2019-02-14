/*   Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner scan = new Scanner (System.in);
		double n = scan.nextDouble();
		String alpha = scan.next();
		char c = alpha.charAt(0);
		double sum=0;
		sum= 1.59*n; 
		
		if (c=='A') {
			sum = sum+1700;
			
		}
		else if (c=='B') {
			sum = sum+1500;
			
		}
		else {
			sum = sum+1300;
			
		}
		long salary;
		if (sum%1>=0.5)
			salary= (long) sum+1;
		else 
			salary= (long)sum;
		System.out.println(salary);

	}
}