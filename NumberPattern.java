/*  Print the following pattern for the given N number of rows.
Pattern for N = 4
1234
123
12
1
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
       Scanner scan = new Scanner (System.in);
		 int n = scan.nextInt();
		 
		 int i=1;
		 while (i<=n) {
			 int j=1;
			 while (j<=n-i+1) {
				 System.out.print(j);
				 j++;
			 }
			 i++;
			 System.out.println();
		 }


	}
}