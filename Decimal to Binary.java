/*Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So take the answer as long.
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner scan = new Scanner (System.in);
		long n1= scan.nextLong();
		long sum=0;
		
		int j=1;
		while (n1>0) {
			long remainder= n1%2;
			long power=1;  
			int i=1;
			while (i<j) {
				power=power*10;
				i++;
			}
			
			sum=sum+ (remainder*power);
			n1=n1/2;
			j++;
						
		}
		
		System.out.println(sum);
		  
	}
}