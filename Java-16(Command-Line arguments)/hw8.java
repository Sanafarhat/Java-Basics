// Find  outputs  (Home work)
class prog4c
{
    public  static  void  m1(Object  o)
	{
		System . out . println("m1(Object)  method  : " + o);
	}	
	public  static  void  main(String[]  args)
	{
		m1("Hyd");  // error: m1(Object) method returns Hyd
		m1(new  Object()); // m1(Object)
		m1("null");  // m1(Object) method returns null 
		m1(null);   // 
	}
}