/* Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits means numbers not the places. That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      	Scanner scan = new Scanner (System.in);
    	long n = scan.nextLong();
    	
    	int i=1;
    	int evensum=0;
    	int oddsum=0;
    	while (n!=0) {
    		long k = n%10;
    		if (k%2L==0) {
    			evensum=(int)(evensum + k);
    		}
    		else {
    			oddsum= (int)(oddsum +k);
    		}
    		n=n/10;
    	
    		    	}
    	
    	System.out.println(evensum+" "+oddsum);

	}
}