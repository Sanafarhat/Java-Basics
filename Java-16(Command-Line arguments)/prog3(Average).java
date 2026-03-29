/*
Write  a  program  to  determine  average  of  command  line  inputs
1) java   classname   10.8   25   14.2   19   7.6
    What  is   the  output ? --->  (10.8 + 25 + 14.2 + 19 + 7.6) / 5
    sum = 0  + 10.8 + 25.0 + 14.2 + 19.0 + 7.6

2) java   classname
    What  is   the  output  ? --->  Pls  send  inputs

3) java  classname   25   Ten
    What  is   the  output ? --->  Do  not  send  number  and  string
*/
class prog3
{
    public static void main(String[] args)
    {
		if(args . length == 0)
			System . out . println("Send  at   least  one  input");
		else
		{
			try
			{
				double sum = 0 ;
				for(int i = 0 ; i <= args.length-1 ; i ++ )
					sum += Double.parseDouble(args[i]) ;
				System.out.println("Avg : " +  sum / args.length);
			}
			catch(NumberFormatException e)
			{
				System.out.println(" Do  not  send  number  and  string");
			}
		}
	}
}


/*
1) What  is  0 / 0  ?  --->  Throws  ArithemticException  becoz  both  are  integer  zeroes
    What  is   0 / 0.0 ? ---> NaN  due  to  0.0
    What  is  0.0 / 0  ? ---> NaN  due  to  0.0
    What  is  0.0 / 0.0 ? ---> NaN  due  to  0.0

2) java  prog3   25  Ten
    Which  statement  throws  error ?  --->  parseDouble("Ten")  throws  NumberFormatException

3) catch(NumberFormatException e)
    {
    }
	When  is  the  above  catch  block  executed ?  --->  When  try  block  throws  NumberFormatException
*/
