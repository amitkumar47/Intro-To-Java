/* An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
          Scanner scan =new Scanner (System.in);
			int n= scan.nextInt();
			int pow=1;
			int k=n;
			int i;
	  for ( i=1; k>=1  ;i++) {
		  pow=pow*10;
		  k=n/pow;
		 }
	  i--;
		
		
		 int rem;
		 int power=10;
		 int sum =0;
		 int b=n;
     for (int j=1 ;j<=i ;j++) {
    	  rem = n%10;
    	  int a= rem;
    	 
    	  for (int l=1; l<i ;l++) {
    		  a=a*rem;
    		  
    	  }
    	  n=n/10;
    	  sum=sum+a;
    	
    	  
    	  
     }
     if(b==sum) {
    	 System.out.println("true");
     }
     else 
    	 System.out.println("false");
     
	}
}
