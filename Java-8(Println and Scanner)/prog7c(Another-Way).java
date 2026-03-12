// What  is  another  way  to  read  character  input
import  java . io . IOException;
class  prog7c
{
	public  static  void  main(String[]  args)   throws  IOException
	{
		System . out . print("Enter  any  character :  ");
		char  ch  = (char)System . in . read();  //  Reads  unicode  value  of  char  which  is  typecasted  to char
		System . out . println("ch  :  " + ch); //  ch :  user-input
		//char  a  = System . in . read(); //  Error :  Mismatch  in  types  i.e. char  and  int
	}
}


/*
Input      What  does  read()  method  read ?        What  is  the   result  of  (char) input
-------------------------------------------------------------------------------------------------------------
   A                                   65                                                 (char)65  is  'A'

   7                                    55                                                 (char)55  is  '7'

   $                                   36                                                  (char)36  is  '$'

   Space  bar                     32                                                  (char)32  is   ' '

   Tab  key                         12                                                  (char)12  is  '\t'

   Enter  key                       8                                                  (char)8  is  '\n'
*/
