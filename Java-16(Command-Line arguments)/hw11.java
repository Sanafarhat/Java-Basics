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
		m1(new  StringBuffer("Sec"));  // error
		m1(null); // m1(null) points to no object
	}
}