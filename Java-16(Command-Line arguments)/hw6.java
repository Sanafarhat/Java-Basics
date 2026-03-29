// Find  outputs  (Home  work)
class  prog3c
{
	public   static  void  m1(int  i)
	{
		System . out . println("m1(int)  method :  " + i);
	}    
	public  static  void  main(String[]  args)
	{
		m1(25); //  m1(int) method returns 25
		m1(10.8f); //  error
		m1('A');  // m1(char) method returns 65
		m1(75L); // error: cannot convert long to int
		m1(24.6); // error: cannot convert double to int
	}
}