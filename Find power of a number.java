/*   Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       Scanner scan = new Scanner (System.in);
		long n1= scan.nextLong();
		int pow = scan.nextInt();
		
		int j=1;
		long ans= 1 ;
		while (j<=pow) {
			ans = ans *   n1;
			j++;
			
		}
		
		System.out.println(ans);
	}
}
