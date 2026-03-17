// Find  outputs  (Home  work)
import static java.lang.Math.*;
import static java.lang.System.*;
import java.util.Scanner;
class  prog2e
{
	public  static  void  main(String[]  args)
	{
		out.println(PI); //How  to  print  PI  variable  without  classname  prefix  Math  and  System		
		out.printf("%.2f \n",sqrt(2)); //How  to  print   sqrt(2)  with  2  digits  after  decimal  point  without  classname  prefix  Math  and  System
		out.printf("%.2f \n", pow(3.5, 2));//How  to  print   3.5 ^ 2  with  2  digits  after  decimal  point  without  classname  prefix  Math  and  System
	   	out.println(max(10, 7)); //How  to  print   largest  of  10  and  7  without  classname  prefix  Math  and  System
		Scanner sc = new Scanner(in);//How  to  create  Scanner  class  object  without  classname  prefix  System
		exit(0); //How  to  stop  execution  without  class  name  prefix  System
		out.println("Sanaa"); //How  to  print  string  "Sanaa"  without  classname  prefix  System
	}
}


/*
1) import  static  java . lang . System . *;
   What  is  the  advantage  *  in  the  statement ?  --->  All  the  static  variables  and   methods  of   System  class
																					     can  be   used  directly   without  classname  prefix  System

2) import  static  java . lang . Math . *;
    What  is  the  advantage  of  *  in  the  statement ?  --->  All  the  static  variables  and   methods  of  Maath  class
																					           can   be  used  directly  without  class  name  prefix  Math
*/
