// Find  outputs
class  prog3
{
	public  static  void  main(String[]  args)
	{
		int[][]  a = {{10 , 20 , 30 , 40} , {50 , 60 , 70 , 80} , {90 , 100 , 110 , 120}};
		System . out . println(a . getClass() . getName()); // class  name  of  array  'a'  i.e. [[I
		for(int i = 0; i < a.length; i++)
         		System.out.println(a[i].getClass().getName());  // class  name  of  row  a[i]   i.e. 3  times  [I
		System.out.println(a.hashCode());  // hash  code  of  array  'a'
		for (int i = 0; i < a.length; i++)
    			System.out.println(a[i].hashCode()); //  hash  code  of  each  row
	}
}
