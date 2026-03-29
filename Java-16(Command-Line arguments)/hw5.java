// Find  outputs  (Home  work)
class prog3b
{
    public   static  void  m1(float  f)
	{
		System . out . println("m1(float)  method :  " + f);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  // converts int to float i.e. 25.0
		m1(10.8f); // m1(float) method returns 10.8
		m1('A');  // m1(char) method returns 65.0
		m1(75L); // error
		m1(24.6); // error
	}
}