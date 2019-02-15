/* 
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/

import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
      Scanner scan =new Scanner (System.in);
			int n= scan.nextInt();
			
	    for (int i=01 ; i<=n ; i++) {
	    	int k=n;
	    	for (int j=1  ; j<=n; j++) {
	    	
	    		if (j==(n+1-i)) {
	    			System.out.print("*");
	    			k--;
	    			continue;
	    		}
	    		System.out.print(k);
	    		k--;
	    	}
	    	System.out.println();
	    }

	}
}
