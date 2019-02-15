/* Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner scan = new Scanner (System.in);
		   int n = scan.nextInt();
		   int pow=1;
		   
		   for (int i=1;i<=n; i++ ) {
			   pow= i*i;
			   if (n==0) {
				   System.out.println("0");
				   break;
			   }
			   else if (n==1) {
				   System.out.println("1");
				   break;
			   }
			   else if (pow>n) {
				   System.out.println(i-1);
				   break;
			   }
		   }

	}
}