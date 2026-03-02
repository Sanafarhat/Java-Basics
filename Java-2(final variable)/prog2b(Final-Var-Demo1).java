//  Find  outputs
class  prog2b 
{
	public  static  void  main(String[]  args) 
	{
		final  int  X = 10; //  'X'  is  final  variable  with  value  10
		int  y = 20;  //  'y'  is  regular  variable  with  value  20
		System . out . println(X); //   Value  of  'X'  i.e. 10
		System . out . println(y); //  Value  of  'y'  i.e.  20
		y = y + 7; //  y = 20 + 7 = 27
		//X = X + 5; // Error  :  final variable  can  not  be  modified
		System . out . println(X); //   Value  of  'X'  i.e.  10
		System . out . println(y); //  Value  of  'y'  i.e.  27
	}
}
