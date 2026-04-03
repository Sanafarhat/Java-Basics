// Find  outputs
class  prog9b
{
	public  static  void  m1(long   x)
	{
		System . out . println("Typecasting  method : " + x);
	}
	public  static  void  m1(int...   x)
	{
		System . out . println("Var-Arg  method : " + x[0]);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  //  Typecasting  method : 25
	}
}
