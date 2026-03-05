// char  demo  program
class  prog7b 
{
	public  static  void  main(String[]  args) 
	{
		char  ch = 'g';  //  ch  is   char  vaiable  with  value  'g'
		System . out . println(ch); //  Value of ch   i.e.  g 
		System . out . println(Character . SIZE); // size  of char i.e. 16  bits
		System . out . println((int) Character . MAX_VALUE); // max  value  of  char  i.e.   2 ^ 16 - 1  = 65535
		System . out . println((int) Character . MIN_VALUE); // min value of char is 0
		System . out . println(Character . MAX_VALUE);  //  That  char  whose  unicode  value  is  65535  i.e.  ?
		System . out . println(Character . MIN_VALUE);  //  That  char  whose  unicode  value  is  0  i.e.  Nothing  
		//ch = 65536;  //  Error : char variable  can  not  hold  value  more  than 65535
		//ch = -1;  //  Error :  char variable  can  not  hold  value  less  than  0
		//System . out . println(char . SIZE); // Error :  char  is  not  a  class
	}
}


/*
1) What  is  the  unicode  value  of  '\0' ?  --->  0

2) Can  '\0'  be  printed ?  ---> No  becoz  it  is  a  non-printable  character
*/
