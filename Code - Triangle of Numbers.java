/*  Print the following pattern for the given number of rows.
Pattern for N = 3
       1
     232
   34543

*/

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/ Scanner scan = new Scanner (System.in);
		 int num = scan.nextInt();
		 int i=1;
		 while (i<=num) {
			 int j=2;
			 while (j<=num+1-i) {
				 System.out.print(" ");
				 j++;
				 
			 }
			 int k=1;
			 int l=i;
			 while (k<=i) {
				 System.out.print(l);
				 k++;
				 l++;
			 }
			 
			int a=2;
			int b=(2*i)-2;
			while (a<=i) {
				System.out.print(b);
				b--;
				a++;
			}
			
			 i++;
			System.out.println("");		 
			 }
	}
}