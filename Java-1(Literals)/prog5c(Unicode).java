// Find  outputs
class  prog5c
{
	public  static  void  main(String[]  args)
	{
		System . out . println('A'); //  A
		System . out . println((int)'A');  //  'A'  is  typecasted  to  int  i.e.  unicode  value  of  'A'  i.e.   65
		System . out . println((int)'Z');  //  'Z'  is  typecasted  to  int  i.e.  unicode  value  of  'Z'  i.e.   90
		System . out . println((int)'a'); //  'a'  is  typecasted  to  int  i.e.  unicode  value  of  'a'  i.e.   97
		System . out . println((int)'z');  //  'z'  is  typecasted  to  int  i.e.  unicode  value  of  'z'  i.e.   122
		System . out . println((int)'0');  //  '0'  is  typecasted  to  int  i.e.  unicode  value  of  '0'  i.e.   48
		System . out . println((int)'9');  //  '9'  is  typecasted  to  int  i.e.  unicode  value  of  '9'  i.e.  57
		System . out . println((int)'$');  //  '$'  is  typecasted  to  int  i.e.  unicode  value  of  '$'  i.e.  36
		System . out . println((int)' ');  //  ' '  is  typecasted  to  int  i.e.  unicode  value  of  ' '  i.e.   32
		System . out . println(4 + 5);  //  9
		System . out . println('4' + '5'); //  52 + 53 = 105
		System . out . println('A' >  'B'); //  65 > 66  is  false 
	}
}
