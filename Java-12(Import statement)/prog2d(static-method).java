// Find  outputs (Home  work)
import static java.lang.System.out;
import static java.lang.System.exit;
import static java.lang.Math.sqrt;
class  prog2d
{
	public  static  void  main(String[]  args)
	{
		out . println("Hello"); //How  to  print  string  "Hello"  without  classname  prefix  System  
		out.println(sqrt(25)); //How  to  print  sqrt(25)  without  classname  prefix  Math 
		exit(0); //How  to  stop  execution  without  class  name  prefix  System
		out.println("Sanaa"); //How  to  print  string  "Sanaa"  without  classname  prefix  System		
	}
}


/*
1) println("Hello");
    Is  the  statement  valid ?  --->  No  becoz  there  is  no  println()  method  in  current  class  i.e.   prog2d  class

2) import  static  java . io . PrintStream . println;
    Is  the  statement  valid ?  --->  No  becoz  println()  is  not  a   static   method  of  PrintStream  class
*/
