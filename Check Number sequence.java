/* You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true.
You just need to print true/false. No need to split the sequence.

Sample Input 1 :
5
9 8 4 5 6
Sample Output 1 :
true
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
     Scanner scan = new Scanner (System.in);
		int n1= scan.nextInt();
		int a = scan.nextInt();
		int b= scan.nextInt();
		int check=0;
		int precheck=0;
		int i=1;
		while (i<n1) {
			
			if (a<b) {
			   precheck=check;
			   check=1;
			   
			}
			else if (a>b) {
				precheck=check;
				check=0;
			
			     if (precheck==1 && check==0) {
				 System.out.println("false");
				 return;}
			 }
			
			if(i==n1-1)
				break;
			int k=b;
			b=scan.nextInt();
			a=k;
			i++;
		
			
		}
		System.out.println("true");
				
	}
}
