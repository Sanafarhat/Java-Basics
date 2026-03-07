//  String  demo  program
class  prog13b
{
	public  static  void  main(String[]  args)
	{
		String  a = new  String("Rama Rao");  //  Ref  'a'  points  to  String  object  "Rama  Rao"
		System . out . println(a);  //  Rama Rao
		System . out . println(a . hashCode());  // Hashcode  of  object  'a'
		String  b = "Hyd";   //  Ref  'b'  points  to  String  object  "Hyd"
		System . out . println(b); // Hyd
		System . out . println(b . hashCode());  // Hashcode  of  object  'b'
	}
}


/*
1) How  to  print  content  of  the  object ?  ---> System . out . println(object)

2) How  to  print  hash  code  of  the  object ?  ---> System . out . println(object . hashCode())
*/
