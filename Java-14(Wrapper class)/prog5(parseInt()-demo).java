// parseInt()  method  demo  program
class  prog5
{
	public  static void  main(String[]  args)
	{
		System . out . println(Integer . parseInt("25")); //  Converts   "25"  to  25 
		System . out . println(Integer . parseInt("0075")); // Converts   "0075"  to  75
		//System . out . println(Integer . parseInt("10.8")); // Error :  Argument  should  not  be  string  double
		//System . out . println(Integer . parseInt("Ten")); // Error :  Argument  should  not  be  a  string  
		System . out . println(25 + ""); // 25 + "" = "25"  i.e.  Converts  25  to  "25"
	}
}
 
 
 /*
parseInt()   method
-----------------------
1) What  does  parseInt()  method  do ?  --->  Converts  string  integer  to  integer

2) What  is  the  argument  of  parseInt()  method ?  --->  String  integer

3) Integer . parseInt("25")
    Why  is  parseInt()  method  called  thru  classname  Integer ?  --->  Since  it  is  a  static  method  of  Integer  class

4) How  to  convert  integer  to  string ? --->  Concatenate  with  an  empty  string  i.e.  ""
*/
