//  Write  a  program  to   print  3rd , 4th  and  5th  elements  of  array
class  prog6
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 12 , 18 , 19 , 14};
   		System . out . println("Regular for loop");
		for(int i = 2; i < 5; i++)
			System.out.println(a[i]); // 15  <next  line>  12  <next  line>  18  <next  line>
		//How  to  print  elements   of  array  from  indexes  2  to  4  with  for  each  loop  --->  Not  possible
	}
}

// for ... each  loop  can  iterate  whole  array  but  not  a   part  of  the  array
