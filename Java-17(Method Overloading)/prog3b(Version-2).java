// Find  outputs  (Home  work)
class prog3b
{
    public   static  void  m1(float  f)
	{
		System . out . println("m1(float)  method :  " + f);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  //  m1(float) method :  25.0
		m1(10.8f); // m1(float) method  :  10.8
		m1('A');  // m1(float) method  :  65.0
		m1(75L); // m1(float) method  :  75.0
		//m1(24.6); //  Error :  double  can  not  be  converted  to  float
	}
}
