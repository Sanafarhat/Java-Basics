// PrintWriter  class  demo  program
import  java . io . PrintWriter;
class  prog8a
{
	public  static  void  main(String[]  args)
	{
		PrintWriter   pw  = new  PrintWriter(System . out , true);
		pw . println(25);  //  Prints  25  on  console
		pw . println(10.8);  //  Prints  10.8  on  console
		pw . println('g');   //  Prints  'g'   on  console
		pw . println(false);  //  Prints   false  on  console
		pw . println("Hyd");  //  Prints  "Hyd"  on  console
		pw =  new  PrintWriter(System . out  ,  false);
		pw . println("Sec");  //  Does  not  print  "Sec"  on  console  due  to  false
		pw  = new  PrintWriter(System . out);  //  Default  2nd  argument  is  false
		pw . println("Cyb");  //  Does  not  print  "Cyb"  on  console  due  to  false
	}
}
