// Find  outputs  (Home work)
class prog4d
{    
	public  static  void  m1(String  s)
	{
		System . out . println("m1(String) :  " + s);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd");  // m1(String) : Hyd
		m1(new  Object()); // error
		m1("null");  // m1(String) : null
		m1(null);    // points to no object
	}
}