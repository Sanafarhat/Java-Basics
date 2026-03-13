//  Can  a  file  have  multiple  classes ?   -> yes, if it is a regular class and no if it is a public class 
class  c1  
{
}
public  class  prog4   // file name must match the classname i.e. prog4.java
{
}
class  c2
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method  of  class  c2"); // main method of class c2
		c1  a  = new  c1(); 
		prog4  b =  new  prog4(); 
	}
}