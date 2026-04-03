// Find  outputs   (Home  work)
import  java . util . Arrays;
class  prog4
{
	public  static  void  m1(int  a , int...  b)
	{
		System . out . println("a : " + a);
		System . out . println("b : " + Arrays . toString(b));
		System . out . println();
		System . out . println();
	}
	public static void main(String[] args)
	{
		m1(25 , 10 , 20 , 15 , 18);  // a   is  25  and  'b'  is  array  of  [10 , 20, 15 , 18]
		m1(100 , 200);  //   'a'  is  100  ,  'b'  is   array  of  [200]
		m1(75);   //'a'   is  75  and   'b'  is  []
		//m1();  // Error  :   Arg  is  not  passed  for  'a'
	}
}


/*
1) How  many  arguments  can  be  passed  for  'b' ?  --->  0 , 1   (or)  more  than  one  as  it  is  a   var-arg  parameter

2) How  many  arguments  can  be  passed  for  'a' ?  --->  Exatcly  one  as  it  is  a  regular  argument
*/
