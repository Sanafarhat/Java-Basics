/*
Write  a  program  to  determine  largest  command  line  input

1) java   classname   10   20.8  30   25.6   40   35.2
    What  is  the  output ?  --->  Largest  number  is   40

2) java  classname
    What  is  the  output ?  --->  Pls  send  inputs

3) java   classname   25   Ten
     What  is  the  output ?  ---> Do  not  send  number  and  string
*/























class prog2b
{
    public static void main(String[] args)
    {
		try
		{
			double  a ;
			double  max =  Math . max(Double . parseDouble(args[0]) , Double . parseDouble(args[1]));
			for(int i = 2 ; i <= args.length-1 ; i ++ )
					max =  Math . max(max , Double . parseDouble(args[i]));
			System.out.println("Largest number is " + max) ;
		}
		catch(ArrayIndexOutOfBoundsException   e)
		{
			System . out . println("Send  at   least  one  input");
		}
		catch(NumberFormatException   e)
		{
			System . out . println("Do  not  send  number  and  string");
		}
	}
}




/*
1) java   prog2b
    Which  statement  throws  error ?  --->


	args[0]  throws  ArrayIndexOutOfBoundsException  becoz  index  0  does  not  exist

2) java   prog2b   25   Ten
    Which  statement  throws  error ?  --->


										Double . parseDouble("Ten")  throws  NumberFormatException  becoz  "Ten"  can  not  be  converted  to  double

3) catch(ArrayIndexOutOfBoundsException   e)
    {
	}
	When  is  the  above  catch  block  executed ?  --->


	When  ArrayIndexOutOfBoundsException  is  thrown  by  the  try  block

4) catch(NumberFormatException   e)
    {
	}
	When  is  the  above  catch  block  executed ?  --->


	When  NumberFormatException  is  thrown  by  the  try  block
*/
