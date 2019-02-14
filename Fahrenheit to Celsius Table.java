/*  Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
 *   you need to convert all Fahrenheit values from Start to End at the gap of W, 
 *    into their corresponding Celsius values and print the table.
*/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner scan = new Scanner (System.in);
    	int start = scan.nextInt();
    	int end = scan.nextInt();
    	int gap = scan.nextInt();
    	
    	while (start<=end) {
    		int d= ((start- 32)*5)/9;
    		System.out.println(start+" \t "+d);
    		start=start+gap;
    	}    

		
	}

}

