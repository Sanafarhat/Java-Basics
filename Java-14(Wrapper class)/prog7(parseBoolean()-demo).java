// parseBoolean()  method  demo  program
class  prog7
{
	public  static void  main(String[]  args)
	{
		System . out . println(Boolean . parseBoolean("true")); // Converts  "true"  to  true
		System . out . println(Boolean . parseBoolean("True")); // Converts  "True"  to  true
		System . out . println(Boolean . parseBoolean("TRUE")); // Converts  "TRUE"  to  true
		System . out . println(Boolean . parseBoolean("false")); // Converts  "false"  to  false
		System . out . println(Boolean . parseBoolean("False")); // Converts   "False"  to  false
		System . out . println(Boolean . parseBoolean("FALSE")); // Converts  "FALSE"  to  false
		System . out . println(Boolean . parseBoolean("Hyd"));  // Converts  "Hyd"  to  false
		System . out . println(Boolean . parseBoolean("")); // Converts  ""  to  false
		System . out . println(Boolean . parseBoolean("25"));  // Converts  "25"  to  false
		System . out . println(true + "");  //  true + "" = "true"  i.e. converts  true  to  "true"
	}
}
 
/*
parseBoolean()  method
---------------------------
1) What  does  parseBoolean()  method  do ?  --->  Converts  string  to  boolean
 
2) What  is  the  argument  of  parseBoolean()  method ?  ---> String  but  not  necessarily  string  boolean

3) When  does  parseBoolean()  method  return  true ?  ---> Any  form  of  "true"  i.e.  "true" ,"TRUE" , "TrUe" , ....
    When  does  parseBoolean()  method  return  false ?  --->  Any  string  except  any  form  of  "true"

4) Boolean . parseBoolean("true")
    Why  is  parseBoolean()  method  called  thru  classname  Boolean ?  ---> Since  it  is  a  static  method  of  Boolean  class

5) How  to  convert  boolean  to  string  ?  ---> Concatenate  with  empty  string
*/
