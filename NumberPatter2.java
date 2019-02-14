/*   Print the following pattern for the given N number of rows.
Pattern for N = 4
1
11
202
3003
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
				 if (i==1) {
					 System.out.print("1");
				 }
			   else if (j==1 || j==i) {
					 System.out.print(i-1);
				 }
				 else {
					 System.out.print("0");
				 }
				 j++;
				 
			 }
			 System.out.println();
			 i++;
		 }

	}
}