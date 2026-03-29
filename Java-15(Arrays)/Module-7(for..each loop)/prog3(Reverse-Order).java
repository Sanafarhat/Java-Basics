// How  to  print  array  in  reverse  order
class  prog3
{
	public  static  void  main(String[]  args)
	{
		int  a[] = {10 , 20 , 15 , 18};
		System . out . println("Array  in  reverse  order");
		for(int i = a.length - 1; i >=0; i--)
			System.out.println(a[i]);  //  18  <next  line>  15  <next  line>  20  <next  line>  10  <next  line>
	   	// How   to  print  each  element  of  array  in  reverse  order  with  for  each  loop  --->  Not  possible
	}
}

// for ... each  loop  can  not  iterate  array  in  reverse  order
