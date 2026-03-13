// Write  a  program  to  print  current  date  and  time
import  java . util . Date;
class  prog2c
{
	public  static  void  main(String[]  args)
	{
		Date   d = new   Date();  //  Constructor  of  Date  class  initializes  object  with   current  date , time  and  day  of  the  week
		System . out . println(d);  //  toString()   method  of  Date  class  returns  current  date , time  and  day  of  the  week  which  are  in   object  'd'
	}
}


/*
System . out . println(d);    
System . out . println(d . toString());    
What  is  the  difference  between  the  two  statements ?  --->	
																1st  statement  executes  toString()  method  implicitly  and	
																2nd  statement  calls  toString()  method  explicitly  
*/
