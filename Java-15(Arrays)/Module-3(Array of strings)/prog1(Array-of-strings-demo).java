// Array  of  strings  demo  program
class   prog1
{
	public  static  void  main(String[]  args)
	{
		String[]  a = new  String [4];   // Array  of  4  null's
		for(int i = 0; i < a.length; i++)
                         System.out.println(a[i]);  // 4  times  null
		String[]  b = new  String[]  {"Hyd" , "Pune" , "Chennai" , "Vijayawada"}; //   Array  of   4  strings
		System . out . println("No.of strings in  Array  b  : " + b.length); //  4
		for(int i = 0; i < b.length; i++)
                      System . out . println(b[i]);  //  Hyd  <next  line>  Pune  <next  line>  Chennai  <next  line>  Vijayawada  <next  line>
		for(int i = 0; i < b.length; i++)
                      System.out.println(b[i].length());  //  3  <next  line>  4  <next  line>  7  <next  line>  10  <next  line>
		System . out . println(b . getClass() .getName()); //  Classname  of  array  'b'  i.e.  [Ljava.lang.String;
		System . out . println(b . hashCode());  //  Hash  code of array b(may be 1000)
		System . out . println(b); // [Ljava.lang.String;@hexa-decimal-hash-code-of-array-'b'
	}
}
