// Find  outputs  (Home work)
class prog4b
{
    public  static  void  m1(Object  o)
	{
		System . out . println("m1(Object)  method");
	}
	public  static  void  m1(String  s)
	{
		System . out . println("m1(String) :  " + s);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd"); // m1(string) method returns Hyd
		m1(new  Object());  // m1(Object) method 
		m1("null"); // m1(string) method returns null
		m1(null);   // m1() points to no object
	}
}