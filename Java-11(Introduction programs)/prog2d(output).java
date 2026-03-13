// Find  outputs
class  prog2d
{
	public  static  void  main(String[]  args)
	{		
		String  s = "Hyd";
		System . out . println(s); //  toString()  method  of  String  class   returns  "Hyd"
		System . out . println(s  . toString()); //   Hyd
		int  x = 25;
		System . out . println(x);  //  Value  of  variable  'x'   i.e. 25
		//System . out . println(x . toString());  // Error :  Method  can  not  be  called  thru  vaiable 
	}
}


/*
1) Is  variable . method()  valid ?  --->   No  becoz  method  can  not  be  called  thru  variable
 
2) Is  object . method()  valid ?  --->  Yes  becoz  method  can  be  called  wrt  object
*/
