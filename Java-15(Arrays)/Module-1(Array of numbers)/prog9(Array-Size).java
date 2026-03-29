//  Identify  error
class  prog9
{
	public  static  void  main(String[]  args)
	{
		//int[]  a = new  int  [-5]; // Error :  Array  size  cannot  be  negative 
		int[]  b = new  int  [5]; // Valid :  Array  size  can  be  +ve
		System . out . println(b . length);  //  5
		int[]  c = new  int  [0];  // Valid :  Array  size  can  be  0
		System . out . println(c . length); //  0
		//int[]  d = new  int  []; // Error :  Array  size is  missing
		//int[5]  e = new  int  [5]; //  Error :   Dimension  is  not  permitted  on  left  side  as  'e'  is  reference
	}
}
