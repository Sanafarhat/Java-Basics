/*
Write  a  program  to   determine  command  line  input  is  even  or  odd  number

1) java  classname   26
    What  is  the  output  ?  ---> Even  number

2) java  classname   45
    What  is  the  output ?  --->  Odd  number

3) java  classname
    What  is  the  output ?  --->  Pls  send  an  integer  input

4) java  classname  Ten
    What  is  the  output ?  ---> Pls  send  an  integer  input
*/
class prog4
{
    public static void main(String[] args)
    {
		try
		{
			int  n = Integer . parseInt(args[0]);
			if(n % 2 == 0 )
				System.out.println("Even number") ;
			else
				System.out.println("Odd number") ;
		}
		catch(Exception   e)
		{
			System . out . println("Send  an  integer  input");
		}
	}
}



/*
1) java  prog4
    Which  statement  throws  error ? --->  args[0]  throws  ArrayIndexOutOfBoundsException  becoz  index  0  does  not  exist

2) java  prog4   Ten
    Which  statement  throws  error ? --->  Integer . parseInt("Ten")  throws  NumberFormatException

3) java  prog4   10.8
    Which  statement  throws  error ? --->  Integer . parseInt("10.8")  throws  NumberFormatException

4)	catch(Exception  e)
	{
	}
	When  is  the  above  catch  block  executed ?  --->
												When  try  block  throws  any  exception  becoz  Exception  is  parent  to  all  exception  classes
*/
