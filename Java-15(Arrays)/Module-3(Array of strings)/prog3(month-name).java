/*
Write   a  program  to  print  month  name  for  input  month  number

1) What  is  the  output  when  input  is  6 ?  ---> June

2) What  is  the  output  when  input  is  0  (or)  13 ?  --->  Invalid  month  number

3) What  is  the  range  of  month  number ?  ---> 1  to  12
*/
import  java . util . Scanner;
class  prog3
{
    public  static  void  main(String[]  args)
    {
		try
		{
			String[]  a = {"Jan" , "Feb" , "Mar" , "April" , "May" , "June" , "July" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};  //   Array  of  12  strings
			 	   //               0         1         2           3           4           5           6          7         8          9         10        11
			Scanner s = new Scanner (System . in);
			System . out . print("Enter  month  number (1 - 12) :  ");
			int i = s.nextInt(); // How  to  read  month  number  to  variable  'i'
			System . out . println("Month : " + a[i - 1]);
		}
		catch(ArrayIndexOutOfBoundsException   e)  //  Executed  when  array  index  is  invalid
		{
			System . out . println("Invalid  month  number");
		}
	}
}


/*
1) String[]  a = {"Jan" , "Feb" , "Mar" , "April" , "May" , "June" , "July" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
    How  many  objects  are  created  ?  --->  13  i.e. 12  string  objects  and  one  array

2) What  is  printed  when  input  is  1 ?  --->  a[0]  i.e.  Jan
     What  is  printed  when  input  is  12 ?  --->  a[11]  i.e.  Dec

3) What  happens  when  	input  is  0 ?  --->   a[-1]  throws  ArrayIndexOutOfBoundsException
     What  happens  when  input  is  13 ?  --->   a[12]  throws  ArrayIndexOutOfBoundsException

4) When  is  catch  block  executed ?  --->  When  try  block  throws  ArrayIndexOutOfBoundsException
     When  is  catch  block  skipped ?  --->  When  try  block  does  not  throw  ArrayIndexOutOfBoundsException
*/
