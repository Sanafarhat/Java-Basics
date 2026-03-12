//  What  are  the  outputs  if  inputs  are  25 , 10.8 , true  and  Rama  rao ?
import  java . util . Scanner;
class  prog6b
{
	public  static  void  main(String[]  args)
	{
		Scanner  sc = new   Scanner(System . in);
		System . out . print("Enter an integer number  :  "); 
		int  i = sc . nextInt();  // Reads  integer  input  25  to  variable  'i'
		System . out . print("Enter a  double number  :  "); 
		double  d  = sc . nextDouble();  //  Reads  double  input  10.8  to variable 'd'
		System . out . print("Enter a  boolean  value :  "); 
		boolean  b  = sc . nextBoolean();  //  Reads   boolean  input  to variable 'b'
		System . out . print("Enter a  string  :  "); 
		sc . nextLine();  //  Reads  "\n"  and  ignores
		String  s   = sc . nextLine(); //  Reads  string  input  Rama rao  to  object  's' 
		System . out . println("i :  " + i);  // i : 25
		System . out . println("d :  " + d); // d : 10.8
		System . out . println("b :  " + b); // b : true
		System . out . println("s :  " + s);  // s : Rama rao
	}
}


/*
1) String  s = Scanner . nextLine();
    Is  the  statement  valid ?  --->  No  becoz  nextLine()  is  not  a  static  method  Scanner  class

2) Scanner   s  =  new  Scanner("a.txt")
    From  where  are  inputs  read ? --->  File  a.txt  but  not  from  keyboard

3) Scanner   s  =  new  Scanner(System . in)
    From  where  are  inputs  read ?   ---> Keyboard

4) What  is  the  morale  of  the  above  program ?  --->																														
															Dummy  nextLine()  method  is  needed  when  computer  does  not  wait  for  input

5) What  does  dummy  nextLine()  method  do ?  --->  Reads  "\n"  and  ignores  as  there  is  no  object  on  left  side
*/
