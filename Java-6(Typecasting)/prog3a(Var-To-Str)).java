//  Find  outputs   (Home  work)
class  prog3a 
{
    public  static  void  main(String[]  args)
	{
		int  x =  25;
		//System . out . println((String)x);  //  Error  :   Datatype  int  can  not  be  converted  to  class  String 
		System . out . println(x + ""); // 25 + "" = "25"
		double   m = 10.8; 
		//System . out . println((String)m); //  Error  :   Datatype  double  can  not  be  converted  to  class  String
		System . out . println(m + ""); // 10.8 + "" = "10.8"
		char  ch = 'g';
		//System . out . println((String)ch); // Error  :   Datatype  char  can  not  be  converted  to  class  String
		System . out . println(ch + ""); // g + "" = "g"
		boolean  k  =  true;
		//System . out . println((String)k); // Error  :   Datatype  boolean  can  not  be  converted  to  class  String
		System . out . println(k + ""); // true + "" = "true"
	}
}


/*
1) Can  int  , double , char  and  boolean  be  typecasted  to  String  ?  --->																							
																	No  becoz  datatype  (such  as  int)  can  not  be  converted  to  class  String

2) datatype  can  be  converted  to  another  datatype  but  not  to  a  class

3) How  to  convert  integer , double , character  and  boolean  to  string ?  --->  Concatenate  with  ""
*/
