// null  demo  program  (Home  work)
class prog9b
{
	public  static  void  main(String[]  args)
	{
		String  a = "null"; // Reference  'a'  points to  "null"
		System . out . println(a . length()); // 4
		String  s = null;  // Reference  's'  points to no object
		//System . out . println(s . length()); // Error i.e. NullPointerException  (method  can  not  be  called  thru  null)
		System . out . println(null == null);  // true
		int[]  b  =  null;  //   Ref  'b'  points  to  no  object
		//System . out . println(b == s); // Error :  Different  class  references  can  not  be  compared  i.e.  int[]  and  String
		Object  o = null;  // Reference   'o'   points to no object
		System . out . println(s == o);  // true  :  parent  and  child  class  references  can  be  compared
		//int  x = null;  // Error : variable cannot hold null
	}
}


/*
1) What  can  a  variable  hold  ?  --->  Value  but  not  hash  code  nor  null

2) What  can  a  reference  hold  ?  --->  Either  hashcode  of  the  object  (or)  null

3) Is  object . method()  valid ?  --->  Yes
    Is   null . method()  valid ?    --->   No  becoz  method  can  not  be  called  through  null

4) c1  a = new  c1();
    c2  b = new  c2();
	Is  a == b  valid ?  --->  No  becoz  different  class  references  can  not  be  compared

5) c1  a = new  c1();
    c1  b = new  c1();
	Is  a == b  valid ?  --->  Valid  becoz  same  class  references  can  be  compared
	What  is  the  result  of  a == b  and  why ?  --->  false  becoz  references  'a'  and  'b'  point  to  different  c1  class  objects
*/
