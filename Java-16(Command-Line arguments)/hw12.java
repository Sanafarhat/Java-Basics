// Find  outputs  (Home  work)
class prog5d
{	
    public  static  void  m1(StringBuffer  sb)
	{
		System . out . println("m1(StringBuffer)  :  " + sb);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd"); // error
		m1(new  StringBuffer("Sec")); // m1(StringBuffer) : Sec
		m1(null); // 
	}
}