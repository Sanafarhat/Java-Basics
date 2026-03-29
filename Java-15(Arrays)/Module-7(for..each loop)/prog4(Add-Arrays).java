// How  to  add  arrays  a  and  b  and  store  results  in  array  'c'
import  java . util . Arrays;
class  prog4
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		int[]  b = {30 , 40 , 35 , 12};
		int[] c = new int[4]; // How  to  create  array   'c'
		for(int i = 0; i < a.length; i++)
		        c[i] = a[i] + b[i]; // How  to  add  arrays  'a'  and  'b'  and  store  results  in  array  'c'  with  regular  for  loop
		System.out.println(Arrays.toString(c));  //  [40 , 60 , 50 , 30]
		// How  to  add  arrays  'a'  and  'b'  and  store  results  in  array  'c'  with   for  each  loop  --->  Not  possible
	}
}


/*
1) Can  regular  for  loop  iterate  multiple  arrays  simultaneously ?  --->  Yes

2) Can  for  each  loop  iterate  multiple  arrays  simultaneously ?  ---> No  and  it  can  iterate  only  one  array  at  a   time

3) Is  c = a + b  valid ?  ---> No  becoz  +  can  not  be  used  between  arrays
*/
