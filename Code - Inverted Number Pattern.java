/*   Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/  java.util.Scanner scan = new Scanner (System.in);
	   int n = scan.nextInt();
	   
	   int i=1;
	   while (i<=n) {
		   int j=1;
		   while (j<=n+1-i) {
			   System.out.print(n+1-i);
			   j++;
		   }i++;
		   System.out.println("");
	   }
	   

		
	}

}