/*  Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       Scanner scan =new Scanner (System.in);
	      int n = scan.nextInt();
	      
	      int i=1;
	      while (i<=n) {
	    	  int j=1;
	    	  char c= 'A';
	    	  while (j<=i) {
	    		  
	    		  System.out.print((char)(c+i-1));
	    		  j++;
	    	  }
	      i++;
	      System.out.println();}

		
	}

}