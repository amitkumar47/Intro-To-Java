/*  Print the following pattern for the given number of rows.
Assume, N is always odd.
Pattern for N = 7
   *
  ***
 *****
*******
 *****
  ***
   *

*/


public class solution {

	public static void print(int n) {
	//Write your code here
      
		 int num = n-(n-1)/2;
		 int i=1;
		 while (i<=num) {
			 int j=1;
			 while (j<num+1-i) {
				 System.out.print(" ");
				 j++;
				 
			 }
			 int k=1;
			 int l=i;
			 while (k<=i) {
				 System.out.print("*");
				 k++;
				 l++;
			 }
			 
			int a=2;
			while (a<=i) {
				System.out.print("*");
				a++;
			}			
			 i++;
			System.out.println("");		 
			 }
		 
		  i=num-1;
		 while (i>=1) {
			 int j=num-i;
			 while (j>=1) {
				 System.out.print(" ");
				 j--;
				 
			 }
			 int k=i;
			
			 while (k>=1) {
				 System.out.print("*");
				 k--;
			
			 }
			 
			int a=i;
			while (a>=2) {
				System.out.print("*");
				a--;
			}			
			 i--;
			System.out.println("");		 
			 }
	}


}