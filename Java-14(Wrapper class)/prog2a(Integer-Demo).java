// Integer  class  demo  program
@SuppressWarnings("deprecation")
class  prog2a
{
	public  static  void  main(String[]  args)
	{
		Integer  a = new  Integer(65);  // Creates an Integer object with value 65
		System . out . println(a . intValue()); //  Value  of  object  'a'  in  the  form  of  integer  i.e. 65
		System . out . println(a . doubleValue());  //  Value  of  object  'a'  in  the  form  of  double  i.e.  65.0
		//System . out . println(a . charValue()); // Error : No charValue()  method  in  Integer  class
		System . out . println(a . toString());  // toString()  method  of  Integer  class  returns   "65"  
		System . out . println(a);  // toString()  method  of  Integer  class  returns   "65"  
		System . out . println(a . hashCode()); // hashcode of object  'a'  i.e. 65
		a = 25; //  Boxes  25  to  Integer object  and  ref  'a'  points  to  Integer  object
		System . out . println(a);  // toString()  method  of  Integer  class  returns   "25"  
		//a = new  Integer(); // Error : Integer class has  to  be  initialized 
	}
}


/*
1) What  are  the  two  ways  to  create  an  Integer  class  object ?  --->  a) Integer  a  =  new  Integer(65)
																													 b) Integer  a = 65

2) Integer  a  =  new  Integer(65)
    What  is  the  name  of  object ? ---> 'a'
    What  is  the  type  of  object ?  ---> Integer
    What  is  the  value  of  object ?  ---> 65

3) Which  of  the  following  are  valid ?
	a) Integer  a =  35  --->  Valid  becoz  new  is  optional  to  create  a  wrapper  object
    b) Integer  a = new  Integer()  --->  Error  due  to  no  argument
	                                                         i.e. Wrapper  object  has  to  be  initilaized
    c) Integer  a = new  Integer(10.8)  --->  Error  becoz  double  can  not  be  typecased  to  int
    d) Integer  a = new  Integer("25")  --->  Valid  and  object  contains  25
    e) Integer  a = new  Integer("Ten")  --->  Error:  Argument  should  be  string  integer  but  not  string
    f) Integer  a = new  Integer('A')  --->  Valid  and  char  is  typecasted  to  int  i.e.  65
    g) Integer  a = null  --->  Valid  and  reference  'a'  does  not  point  to  any  object
										   (null  means  no  object)

4) Are  new  Integer(65)  and  65  same ? ---> Yes  and  new  Integer(65)  throws  warning  from  java  9

5) What  does  intValue()  method  do ?  --->  Returns  value  of  object  in  the  form  of  integer
    What  does  doubleValue()  method  do ?  --->  Returns  value  of  object  in  the  form  of  double
    What  does  toString()  method  do ? ---> Returns  value  of  object  in  the  form  of  String

6) When  is  toString()  method  automatically  executed ?  --->   As  soon  as  object  is  printed  with  system . out . println(object)

7) How  to  obtain  hashcode  of  an  object ?  --->  With  hashCode()  method

8) What  is  the  hashcode  of  Integer  object ?  --->  Content  itself

9) For  which  wrapper  objects  is  the  content  a  hashcode ?  --->  Integer , Character  and  Long
*/
