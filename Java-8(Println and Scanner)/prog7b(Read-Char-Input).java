//  How   to  read   character  input ?
import  java . util . Scanner;
class  prog7b
{
	public  static  void  main(String[]  args)
	{
		Scanner  s = new   Scanner(System . in);
		System . out . print("Enter  any  character  :  ");
		char  ch = s . nextLine() . charAt(0); //  "g" . charAt(0)  is  'g'
		System . out . println("ch : " + ch);  
		//ch = s . nextLine();  //  Error :  Mismatch  in  types  i.e.  char  and  String
	}
}


/*
1) Is  there  any  method  in  Scanner  class  to  read  character  input ? ---> No

2) How  to  read  character  input ?  --->  s . nextLine() . charAt(0)

3) What  does  s . nextLine() . charAt(0)  do ?  --->													
															Reads  character  input  in  the  form  of  string  and  converts  to  character

4) Let  input  be  g,
    What  does  nextLine()  method  do  ?  --->  Reads   "g"
    What  does  "g" . charAt(0)  do ?  ---> Converts  "g"   to  'g'
*/
