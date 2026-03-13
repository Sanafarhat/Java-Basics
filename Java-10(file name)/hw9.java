/*
Write  a  program  to  add , subtract , multiply  and  divide  two  numbers
Also  find  remainder ,  sqrt  of  1st  input , a ^ b  and  largest  number
*/

import java.util.Scanner;
import java.lang.Math;
public class p1 {
	public static void main(String[] args){
		System.out.println("Enter any 2 numbers : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int s = i + j;
		int d = i - j;
		int p = i * j;
		double q = (double)i / j;
		int r = i % j; 
		System.out.println("Sum : "+s);
		System.out.println("Difference : "+d);
		System.out.println("Product : "+p);
		System.out.println("Quotient : "+q);
		System.out.println("Remainder : "+r);
		System.out.println("Sqrt of 1st input : "+Math.sqrt(i));
		System.out.println("Power : "+Math.pow(i,j));
		System.out.println("Largest Number : "+Math.max(i,j));

	sc.close();
		
}
}