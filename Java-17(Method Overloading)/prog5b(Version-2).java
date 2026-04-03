// Find  outputs  (Home  work)
class prog5b
{
	public  static  void  m1(String  s)  // Ref  's'  points  "Hyd"
	{
		System . out . println("m1(String)  :  "  + s);
	}
    public  static  void  m1(StringBuffer  sb)  //  Ref  sb  points  to  StringBuffer  object  which  has  "Sec"
	{
		System . out . println("m1(StringBuffer)  :  " + sb);
	}
	public  static  void  main(String[]  args)
	{
		m1("Hyd"); // m1(String) : Hyd
		m1(new  StringBuffer("Sec")); // m1(StringBuffer) : Sec
		//m1(null); //Error :  Confusion  whether  to  execute  m1(String)  (or)  m1(StringBuffer)
	}
}


/*
What  is  the  issue  with  m1(null)  in  the  above  program?  --->
								There  is  a  confusion  to  jvm  whether  to  execute  m1(String) (or) m1(StringBuffer)
*/
