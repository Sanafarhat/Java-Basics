/*
Find  the  output
 
Hint:  Assume  that  there  is  no  Date . class  in  cwd 
*/
import  java . sql . *;
@SuppressWarnings("deprecation")
class  prog1c
{
	public  static  void  main(String[]  args)
	{
		Date   d = new  Date(15 , 8 , 1947); //  Creates  java . sql . Date  class  object
		System . out . println(d . getClass() . getName()); //  classname  of  object  'd'  i.e.  java . sql . Date
		//d = new  Date(); //  Error :  java . sql . Date  constructor  demands  3  args 
	}
}


/*
What  is  the  pre-requisite  to  run  the  above  program ?  --->													
													Remove  Date . java  and   Date . class  files  from  the  current  working  directory
*/
