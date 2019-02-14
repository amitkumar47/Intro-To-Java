/*  Print the following pattern for the given N number of rows.
Pattern for N = 4
1
11
111
1111

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
			 while (j<=i) {
				 System.out.print("1");
				 j++;
			 }
			 System.out.println();
			 i++;
		 }

	}
}