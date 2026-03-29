/*
How  to  print  each  element  of  array  along  with  index
Outputs
----------
0  ...  10
1  ...  20
2  ...  15
3  ...  18
*/
class  prog2
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		System . out . println("Index  ...  Element");
		for(int i = 0; i < a.length; i++)
			System.out.println(i + "..." +a[i]); //  0 ... 10  <next  line>  1 ... 20  <next  line> 2 ... 15  <next  line>  3 ... 18  <next  line>
		// How  to  print  each  element  of  array  and   index  with  for  each  loop   without  using  2nd  variable  --->  Not  possible
	}
}


/*
1) Can  for  each  loop  track  indexes  of  array  elements  ? --->  No

2) In  other words,  for  ...  each  loop  can  track  elements  but  not  thier  indexes

3) int[]  a = {10 , 20 , 15 , 18};
    for(int i = 0 ; i <= a . length - 1 ; i++)
				System . out . println(i + a[i]);
    What  are  the  outputs ?  ---> 10 , 21 , 17 , 21

4) int  i =0;
    for(int  x :  a)
	{
		System . out . println(i + "..." + x);
		i++;
	}
	for  each  loop  can  print  indexes  by  using  another  variable  'i'
*/
