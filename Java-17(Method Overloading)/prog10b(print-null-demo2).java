// How  to  print  null ?
class  prog10b
{
	public  static  void  main(String[]  args)
	{
		System . out . println((String)null);  //   println(String)  prints  null
		System . out . println((Integer)null);  //  println(Integer)  prints  null
		System . out . println((int[])null);  //  println((char [])  prints  null
		System . out . println((prog10b)null);  //  println(Object)  prints  null
		System . out . println((StringBuffer)null);  //   println(StringBuffer)  prints  null
		//System . out . println((int)null);  // Error :  Type  of  null  is  every  classname  which  can  not  be typecasted  to  datatype  such  as  int
		//System . out . println(null);  //  Error  :  Confusion  whether  to  execute  println(String)  (or)  println(char[])
	}
}


/*
How  to  print  null ?  --->  Typecast  null  to  any  classname  such  as   String ,  Integer , StringBuffer ,
										  prog10b ,  int[]  and  so  on
*/
