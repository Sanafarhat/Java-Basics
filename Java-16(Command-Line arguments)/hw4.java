// Find  outputs  (Home  work)
class prog3a
{
	public   static  void  m1(int  i)
	{
		System . out . println("m1(int)  method :  " + i);
	}
    public   static  void  m1(float  f)
	{
		System . out . println("m1(float)  method :  " + f);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  // m1(int) method returns 25
		m1(10.8f); // m1(float) method returns 10.8
		m1('A');  // m1(char) returns A Unicode value i.e. 65
		m1(75L);  // error: cannot convert long to int or long to float
		m1(24.6); // error: cannot convert double to int or double to float
	}
}