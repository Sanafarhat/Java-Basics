// Find  outputs  (Home work)
class prog4b
{
    public  static  void  m1(Object  o) //  Ref  'o'  points  to  Object  class  object
	{
		System . out . println("m1(Object)  method");
	}
	public  static  void  m1(String  s)
	{
		System . out . println("m1(String) :  " + s);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd"); // m1(String)   :  Hyd
		m1(new  Object());  // m1(Object) method
		m1("null"); // m1(String) :  null
		m1(null);   // m1(String) :  null
	}
}


/*
1) m1(null);
    Why  is  m1(String)  method  executed  ?  --->
								Since  m1(String)  has  got  higher  priority  over  m1(Object)  as  String  is  a  child  class  to  object

2) In  other  words,  m1(child  class)  has  got  higher  priority  over  m1(parent  class)

3) What  is   the  difference  between  "null"  , null  and  '\0' ?  --->
																		"null"  is  string  ,  null  is  no  object  and   '\0'  is  null  character
*/
