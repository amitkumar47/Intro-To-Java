/*  Given an integer N, print all the prime numbers that lies in between 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime number in different lines
Constraints :
1 <= N <= 100
Sample Input :
9
Sample Output :
2
3
5
7
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		for (int i=2 ; i <=n ; i++) {
			int check=0;
			for (int j=2; j<i ; j++) {
				if (i%j==0) {
					check=1;
					break;
				}
				
			}
			if(check==0)
				System.out.println(i);}

		
	}
}
