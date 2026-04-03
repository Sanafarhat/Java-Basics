// Find  outputs  (Home  work)
class  prog3c
{
	public   static  void  m1(int  i)
	{
		System . out . println("m1(int)  method :  " + i);
	}
	public  static  void  main(String[]  args)
	{
		m1(25); //  m1(int) method  : 25
		//m1(10.8f); //  Error :float  can  not  be  converted  to  int
		m1('A');  // m1(int) method  :  65
		//m1(75L); //  Error:   long  cannot  be  converted   to int
		//m1(24.6); // Error:   double  cannot  be  converted  to int
	}
}
