// Find  outputs
class  prog1c
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		//int   x;  //  'x'  is  already  declared  in  for  ...  each  loop
		/*
		for(x  :  a)  // Error :  'x'  is  not  declared
				System . out . println(x);
		*/
		for(int  x  :   a)  //  'x'  is  each  element  of  array  'a'
				System . out . println(x);  // 10   <next  line>  20  <next  line>  15  <next  line>  18  <next  line>
	}
}
