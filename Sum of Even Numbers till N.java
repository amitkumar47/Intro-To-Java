// Given a number N, print sum of all even numbers from 1 to N.
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int i =2;
		int sum=0;
		
		while (i<=num) {
			if ((i%2)==0) {
				sum= sum+i;
			}
			i++;
		}
		System.out.print(sum);
		
		
	}

}