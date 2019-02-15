/*  Write a program that asks the user for a number N and a choice C. And then give him the possibility to choose between computing the sum and computing the product of 1 ,..., N.
If user enters C is equal to -
 1 : Print sum of 1 to N numbers
 2 : Print product of 1 to N numbers
 Any other number : print -1
Input format :
Line 1 : Integer N
Line 2 : Choice C (1 or 2)
Output Format :
 Sum or product according to user's choice
Sample Input 1 :
10
1
Sample Output 1 :
55

*/
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
      Scanner scan =new Scanner (System.in);
	      int n1 = scan.nextInt();
	      int n2 = scan.nextInt();
	      
	      if (n2==1) {
	    	  int sum=0;
	    	  for (int i=1 ; i<=n1 ; i++) {
	    		  sum = sum+i;	    		  
	    	  }
	    	  System.out.println(sum);
	      }
	      else if (n2==2) {
	    	  int pro = 1;
	    	  for (int i=1 ; i<=n1 ; i++) {
	    		  pro= pro*i;
	    	  }
	    	  System.out.println(pro);
	      }
	      else
	    	  System.out.println("-1");

	}
}
