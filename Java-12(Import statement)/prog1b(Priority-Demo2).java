/*  (Home  work)
Find  the  output  
 
Assume  that  Date . java  file  is  in  cwd
*/
import  java . sql . *;
class   prog1b
{
	public  static  void  main(String[]  args)
	{
		Date  d = new  Date();   // Creates  Date  class  object  which  is  in  cwd
		System . out . println(d . getClass() . getName()); // class name of object  'd' i.e.  User  defined  class  Date
	}
}


/*
What  is  the  pre-requisite  to  run  the  above  program ?  --->																	
															Define  public  class  Date  in  Date . java  file  in  the  current  working  directory															
*/
