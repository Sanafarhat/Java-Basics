// Find  outputs  (Home work)
@SuppressWarnings("deprecation")
class prog3a
{
	public  static  void  main(String[]  args)
	{
		Double  a = new  Double(10.8); //  'a'  is  Double  class  object  with  value  10.8
		System . out . println(a . doubleValue()); //  Value  of  object  'a'  in  the  form  of  double  i.e. 10.8
		System . out . println(a . intValue()); //  Value  of  object  'a'  in  the  form  of  integer  i.e.  10
		System . out . println(a . toString()); //  Value  of  object  'a'  in  the  form  of  string   i.e.  "10.8"
		System . out . println(a); // toString()  method   of  Double  class  returns  "10.8"
		Character  b = new  Character('g');  //  'b'  is  Character  class  object  with  value  'g'
		System . out . println(b . charValue());  //  Value  of  object  'b'  in  the  form  of  character  i.e.  g
		System . out . println(b . toString());  //  Value  of  object  'b'  in  the  form  of  string   i.e.  "g"
		System . out . println(b); // toString()  method   of  Character  class  returns  "g"
		//System . out . println(b . intValue()); // Error :  No  intValue()  method  in  Character does 
		Boolean  c =  new  Boolean(true);  //  'c'  is   Boolean  class  object  with  value  true
		System . out . println(c . booleanValue());  //  Value  of  object  'c'  in  the  form  of  boolean  i.e.  true
		System . out . println(c . toString()); //  Value  of  object  'c'  in  the  form  of  string   i.e.  "true"
		System . out . println(c);  // toString()  method   of  Boolean  class  returns  "true"
	}
}
