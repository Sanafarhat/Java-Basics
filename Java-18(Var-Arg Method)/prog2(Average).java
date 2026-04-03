// Write  a   method  to  return  average  of  arguments  passed  from  method  call  (Home  work)
class  prog2
{
	public  static  double  avg(int...   a)  //   Ref  'a'  points  to  array  of  arguments  passed  from  method  call
	{
		int sum = 0;
		for(int  x : a) //  'x'  is  each  element  of  array  'a'
				sum += x;  //  sum  of  all  the  elements  in  array  'a'
		return (double)sum/a.length;  //  Average  of  elements  in  array  'a'
	}
	public  static  void  main(String[]  args)
	{
		System . out . println(avg(10 , 20 , 15 , 18)); //Array  of  4  args  is  passed  to  the  method   i.e.  15.75
		System . out . println(avg(100 , 200 , 150));  //Array  of  3  args  is  passed  to  the  method   i.e.  150.0
		System . out . println(avg(30 , 40 , 35 , 32 , 38));  //Array  of  5  args  is  passed  to  the  method   i.e.  35.0
		System . out . println(avg());  //Array  of  0  args  is  passed  to  the  method   i.e.  NaN
		System . out . println(avg(new int [] {70 , 80 , 75 , 72})); //Array  of  4  args  is  passed  to  the  method   i.e.  74.25
	}
}
