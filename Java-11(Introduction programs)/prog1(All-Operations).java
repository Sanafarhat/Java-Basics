/*
Write  a  program  to  add , subtract , multiply  and  divide  two  numbers
Also  find  remainder ,  sqrt  of  1st  input , a ^ b  and  largest  number
*/
import  java . util . Scanner;
class  prog1
{
	public  static  void  main(String[]  args)
	{
		Scanner   s = new   Scanner(System . in);
		System . out . println("Enter  any  2  numbers  ");
		int  a = s . nextInt();   //  10
		int  b = s . nextInt();  //  7
		System . out . println("Sum : " +  (a  + b));
		System . out . println("Difference  :  "  +  (a - b));
		System . out . println("Product  :  "  +  a * b);
		System . out . printf("Quotient :  %.2f  \n"  , (double)a / b);
		System . out . println("Reminder    :  "  +  a % b);
		System . out . printf("Sqrt  of  1st  input :  %.2f \n"  , Math . sqrt(a));
		System . out . printf("Power :  %.2f \n"  ,  Math . pow(a , b));
		System . out . println("Largest  number    :  "  +  Math . max(a , b));
	}
}


/*
1) int  a = 10 , b = 7;
    System . out . println("Sum  :  "  +  a + b);
    What  is  the  output ?  --->  Sum : 107

2) int  a = 10 , b = 7;
    System . out . println("Sum  :  "  +  (a + b));
    What  is  the  output ?  --->  Sum :  17

3) System . out . println("Sum :  " , a + b);
     Is  the  statement  valid ? --->  No  due  to  two  arguments

4) System . out . println("Difference  :  "  +  a - b);
     Is  the   statement  valid ? --->  No  becoz  string  operand  is  not  permitted  for  -  operator

5) What  is  the  result  of  10 / 7 ?  --->  1
    What  is  the  result  of  10.0 / 7  --->  1.42

6) System . out . println("Product  :  "  +  a * b);
    Why  is  a * b  not  in  () ?  --->  Since  *  is evaluated  before  +

7) Math . sqrt(a);
    Math . pow(a , b);
    Math . max(a , b);
    What  is  the  issue  without  prefix  Math ?  --->  
													They  are  searched  in  prog1  class  and  throws  error  as  they  are  not  in  prog1  class

8) s . nextInt();
    What  is  the  issue  without  prefix  object  's' ? --->															
								nextInt()  method  is  searched  in  class  prog1  and  throws  error  as  they  are  not  in  prog1  class

9) double  x = 123.456789;
     System . out . printf("%.2f" , x);
	 What  is  printed ?  ---> 123.46
*/
