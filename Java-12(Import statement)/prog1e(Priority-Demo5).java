/*  (Home  work)
What  is  the  issue  when  both  are  implicit  import  statements  ?  
 
Assume  that  there  is  no  Date  class  in  current  working  directory
*/
import  java . util . *;    //   Valid
import  java . sql . *;    //  Valid
class  prog2e
{
	public  static  void  main(String[]  args)
	{
		Date  d = new  Date(); //  Ambiguity  error : Confusion  whether  to  create  java . util . Date  object (or)  java . sql . Date  object
	}
}


/*
Is  there  any  other  class  which  exists  in  two  packages ?  ---> 																
																			List  class  is  defined  in  java . util  and   java . awt  packages
*/
