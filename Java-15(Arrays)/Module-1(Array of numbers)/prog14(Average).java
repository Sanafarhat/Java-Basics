/*
Write  a  program  to  determine  average  of  array  elements
 
Let  array  contain  10 , 20 , 15 , 18
What  is  the  average ?  --->  (10 + 20 + 15 + 18) / 4  = 15.75
 
sum = 0 + 10 + 20 + 15 + 18 = 63
*/
import  java . util . Scanner;
class  prog14
{
	public  static  void   main(String[] args)
	{
		Scanner s = new Scanner (System . in); 
		System . out . print("How  many  elements ?  :   ");  // How many elements ? :  4
		int n = s.nextInt();  //How  to  read  array  size  into  variable  'n'
		int[] a = new int[n];  // How  to  create  an  array  of  size  'n'
		System  .  out  .  println("Enter  elements"); // Enter elements
		for(int i = 0; i < n; i++)  // How  to  read  elements  into  array
			a[i] = s.nextInt(); // 10 20 15 18
		System . out . println("Average :  " + avg(a)); 
	}
	public  static  double  avg(int[]  b)  //  Ref  'b'  points  to  array  'a'  of  main()  method
	{
		int sum = 0;
		for(int i = 0; i < b.length; i++)
			sum += b[i];	// 0 + 10 + 20 + 15 + 18 = 63	
 		return  (double)sum / b.length;	// 63.0/4 = 15.75 
	}
}



/*
1) Is  b[i]  valid  in  main()  method ?  --->  No  becoz  there  is  no  reference  'b'  in  main()  method
    Is  a[i]  valid  in  avg()  method ?  ---> No  becoz  there  is  no  reference  'a'  in   avg()  method

2) What  are  two  ways  to  use  array  size  in  main()  method ?  --->  n  and  a . length
     What  is  the  only  way  to  use  array  size  in  avg()  method ?  ---> b . length

3) Can  variable  'n'  be  used  in   avg()  method ?  --->  No  becoz  it  is  local  to  main()  method

4) What  is  the  difference  between  0  and  length - 1 ?  --->  Starting  index  and  last  index  of  array

5) In  which  order  can  main()  and  avg()  methods  be  defined  ?  ---> Any  order

6) In  general,  methods  of  the  class  can  be  defined  in  any  order

7) How  to  call  avg()  method  if  it  is  non-static ? ---> prog14  obj = new  prog14();
                                                                                         obj . avg(a)
*/
