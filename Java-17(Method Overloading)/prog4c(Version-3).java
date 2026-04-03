// Find  outputs  (Home work)
class prog4c
{
    public  static  void  m1(Object  o)
	{
		System . out . println("m1(Object)  method  : " + o);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd");  // m1(Object) method  :  Hyd
		m1(new  Object()); // m1(Object)  method :  java.lang.Object@hexadecimal-hash-code
		m1("null");  // m1(Object) method  :  null
		m1(null);   //m1(Object) method  :  null
	}
}
