package capgemini;

import java.util.Arrays;
import java.util.Collections;

public class ArrDemo {
	int a[];
	int b[];
	int c[];
	public static void main(String args[]) {
		int a[]= {1,5,3,9,7};
		int b[]= {2,4,6,8,10};
		int c[]= {5,10,15,20,25};
		int sum=0;
		int diff=0;
		//sum of array A
		for(int num:a) {
			sum=sum+num;
			}
	System.out.println("sum of array a is:"+sum);
	//sum of array B
	for(int num:b) {
		sum=sum+num;
		}
	System.out.println("sum of array b is:"+sum);
//sum of array C
	for(int num:c) {
	sum=sum+num;
	}
	System.out.println("sum of array c is:"+sum);
//sorting an array  in ascending order
	Arrays.sort(a);
	   
	System.out.println("Ascending"+Arrays.toString(a));   
	//sorting array in descending order
 //Arrays.sort(b,Collections.reverseOrder());
	 System.out.println("Descending"+Arrays.toString(b));   
	 
 
}
}