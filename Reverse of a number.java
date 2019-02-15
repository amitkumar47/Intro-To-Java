/*   Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Input format :
Integer N
Constraints:
Time Limit: 1 second
Output format :
Corresponding reverse number
Sample Input 1 :
1234
Sample Output 1 :
4321

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       Scanner scan = new Scanner (System.in);
	   long n = scan.nextLong();
	   long reverse=0;
	   
	   
	   for (int i=1; n!=0 ; i++) {
		   long k=n%10;
		   reverse= (reverse*10) + k;
		   n/=10;
		   
	   }
	   System.out.println(reverse);

	}
}