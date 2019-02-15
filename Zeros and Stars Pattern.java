/*

Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000

*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
       Scanner scan =new Scanner (System.in);
			int n= scan.nextInt();
			
	    for (int i=01 ; i<=n ; i++) {
	    	
	    		for (int j=1  ; j<=n; j++) {
	    		
	    		if (j==i) {
	    			System.out.print("*");
	    			
	    			continue;
	    		}
	    		System.out.print("0");
	    		
	    	}
	    		System.out.print("*");
	    	
	    	
	    	
	    	
	    	for (int j=1  ; j<=n; j++) {
	    		
	    		if (j==(n+1-i)) {
	    			System.out.print("*");
	    			
	    			continue;
	    		}
	    		System.out.print("0");
	    		
	    	}
	    	System.out.println();
	    }
			
		
	}	


}