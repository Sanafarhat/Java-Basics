// How  to  access  array  of  called  method  (i.e.  m1()  method)   in  calling  method  (i.e.  main()  method)
class  prog13b
{
	public  static   int[]    m1()  // return type of the method is int[]
	{
		int[]  a = {10 , 20 , 15 , 18};
		return  a;  //  Array  'a'  is  returned  to  method  call()
	}
	public  static  void  main(String[]  args)
	{
		int[]   b =  m1();// int[]  b = a   i.e.  Ref  'b'  points  to  array  'a'
		for(int i = 0; i < b.length; i++)
            		System.out.println(b[i]); //  10  <next  line>  20  <next  line>  15  <next  line>  18  <next  line>
	}
}


/*
1) How  to  use  array  in  main()  method ?  --->  b[i]
    
2)	How  to  use  array  in   m1()  method ?  ---> a[i]
*/
