// Find  outputs (Home  work)
class  prog1c 
{
	public  static  void  main(String[]  args) 
	{
		int a = 10, b = 20, c = 15;
		//System . out . println(a , b , c); // Error  due  to  more  than  one  argument
		System . out . println(a + "  " + b + "  " + c); // 10 <space>  20  <space>  15
		System . out . println(a + "\n" + b + "\n" + c); // 10  <next line> 20 <next line> 15
		System . out . println(a + "\t" + b + "\t" + c); //10  <tab>  20  <tab>   15
		System . out . println(a + " , " + b + " , " + c);  //  10 , 20 , 15
		System . out . println(a + b + c); // 10 + 20 + 15 = 45
		System . out . println(a); // 10
		System . out . println(b); // 20
		System . out . println(c); // 15
	}
}


/*
1) How  to  print  multiple  variables  with  same  println()  method  ? ---> 
																Concatenate  them  with  +  operator  to  form  a  string  and  print  string

2) System . out . println(a);
    System . out . println(b);
    System . out . println(c);
    How  to  reduce  the  three  statements  to  a  single  statement ?  --->  System . out . println(a + "\n" + b + "\n" + c);
 */
