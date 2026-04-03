// Find  output
class prog10a
{
	public  static  void  main(String[]  args)
	{
		System . out . println(null) ; //  Error : confusion  whether  to  execute  println(String)  (or)  println(char[])
	}
}


/*
1) There  are  multiple  println()  methods  with  reference  argument  in   PrintStream  class

2) public  void  println(char[]   a)
    {
	}
    public  void  println(String  s)
	{
	}
	and  so  on

3) What  is  the  issue  with  System . out . println(null) ?  --->  Confusion  to  jvm  whether  to  execute
																								   println(String)  method  (or)  println(char[])  method
*/
