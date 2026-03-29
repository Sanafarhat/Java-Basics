/*
Write  a  program  to  sort  command  line  inputs

1) java  classname   10.8   20   15.4    5    12.9    18
    What  is  the  output ? --->  [5.0 , 10.8 , 12.9 , 15.4 , 18.0 , 20.0]
     Array  'a'   --->  [10.8 , 20.0 , 15.4 , 5.0 , 12.9 , 18.0]

2) java  classname
    What  is  the  output ? --->  Pls  send  inputs
*/
import java.util.Arrays;
class  prog5
{
	public static void main (String[] args)
	{
		try
		{
			double[] a = new double[args.length] ;
			for(int i = 0 ; i < args.length ; i ++ )
					a[i] = Double.parseDouble(args[i]);
			Arrays.sort(a) ;
			System.out.println("Sorted  results :  " + Arrays.toString(a)) ;
		}
		catch(NumberFormatException e)
		{
			Arrays.sort(args) ;
			System.out.println("Sorted  results :  " + Arrays.toString(args)) ;
		}
	}
}


/*
1) Is  args  an  array  of  strings  (or)  array  of  doubles ?  ---> Array  of  strings
    What  about  array  'a' ?  --->  Array  of  doubles

2) Who  is  creating  args  array  and  when ?  --->  Jvm  as  soon  as  class  is  executed
     What  about  array  'a' ?  --->  It  is  created  with  new  opeartor

3) Who  is  initializing  args  array  and  when ?  ---> Jvm  as  soon   as  class  is  executed
     What  about  array  'a' ?  --->  It  is  initialized  with  for  loop

4) Arrays . sort(args);
    What  are  sorted  ?  --->  Strings  in  args  array  are  sorted  in  alphabetical  order
    Arrays . sort(a);
    What  are  sorted  ?  ---> Numbers  in  array  'a'  are  sorted  in  ascending  order
*/
