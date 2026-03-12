//  next()  Vs  nextLine()
import  java . util . Scanner;
class  prog6c
{
	public  static  void  main(String[]  args)
	{
		Scanner  s = new   Scanner(System . in);
		System . out . print("Enter  a  sentence :  ");	
		String  str1   = s . nextLine();  //  Reads  multiple word  string  to  object  str1
		System . out . print("Enter  a  sentence :  ");
		String  str2   = s . next();  //  Reads  single word  string  to  object  str2
		System . out . println("str1 : " + str1); // str1 : 1st  input
		System . out . println("str2 : " + str2); // str2 :  2nd  input
	}
}
