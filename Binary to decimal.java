/*   Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N
Output format :
Corresponding Decimal number (as integer)
Sample Input 1 :
1100
Sample Output 1 :
12
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner (System.in);
		   int n = scan.nextInt();
		   int k;
		   int dec=0;
		   for (int i=1 ; n!=0; i++) {
			   k=n%10;
			   
				   int pow=1;
				   for (int j=1 ;j<i; j++) {
					   pow=pow*2;					   
				   }
				   dec=dec +(k*pow);
			   
			   
			   n/=10;
		   }
		   System.out.println(dec);


	}
}
