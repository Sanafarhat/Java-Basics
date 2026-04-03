// Find  outputs  (Home  work)
class prog5c
{
	public  static  void  m1(String  s)
	{
		System . out . println("m1(String)  :  "  + s);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd");  // m1(String) : Hyd
		//m1(new  StringBuffer("Sec"));  //  Error :  Ref  's'  can  not  point  to  StringBuffer  object
		m1(null); //  m1(String) :  null
	}
}
