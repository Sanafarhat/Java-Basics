//  Find  outputs  (Home  work)
class  prog3b
{
	public  static  void  main(String[]  args)
	{
		int  x = 100000; //  'x'  is  int  variable  with  value  100000
		System . out . println(x);  // Value  of  'x'  i.e.  100000
		System . out . println(Integer . SIZE);   // size  of  int  i.e. 32  bits
		System . out . println(Integer . MAX_VALUE);  // max  value  of  int  i.e.  2 ^ 31 - 1
		System . out . println(Integer . MIN_VALUE);  //min  value  of  int  i.e.  -2 ^ 31
		//System . out . println(int . MAX_VALUE);  // Error :  int  is  not  a  class
		//x = 2147483648;  // int variable  can  not  hold  value  more  than 2147483647 
		//x = -2147483649; // int variable  can  not  hold  value  less  than -2147483648
		//integer  m = 25; //  Error :  No  datatype integer
	}
}


/*
What  are  SIZE , MAX_VALUE  and  MIN_VALUE  called ? --->  final  static  variables  of  Integer  class
*/
