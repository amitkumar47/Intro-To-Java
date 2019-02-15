/*   Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
Provided N you have to find out the Nth Fibonacci Number. Also F(1) = F(2) = 1.
Input Format :
Integer n
Constraints:
Time Limit: 1 second
Output Format :
Nth Fibonacci term i.e. F(n)
Sample Input :
4
Sample Output :
3 */

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		long a=1;
		long b=0;
		long sum;		
		
		for (long i=1; i<=1000000000L;i++) {
		     if (n==0)
		     {
		    	 System.out.println("0");
		    	 break;
		     }
		     else if (n==1) {
		    	 System.out.println("1");
		    	 break;
		     }
		     else {
			sum=a+b;
			long k=a;
			a=sum;
			b=k;
			if ((i+1)==n) {
				System.out.println(sum);
				break;
			
			}}
			
			}		
		}

}