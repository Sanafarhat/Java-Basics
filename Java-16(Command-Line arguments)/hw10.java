// Find  outputs  (Home  work)
class prog5b
{
	public  static  void  m1(String  s)
	{
		System . out . println("m1(String)  :  "  + s);
	}
    public  static  void  m1(StringBuffer  sb)
	{
		System . out . println("m1(StringBuffer)  :  " + sb);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd"); // m1(String) : Hyd
		m1(new  StringBuffer("Sec")); // m1(StringBuffer) : Sec
		m1(null); // points to no object
	}
}