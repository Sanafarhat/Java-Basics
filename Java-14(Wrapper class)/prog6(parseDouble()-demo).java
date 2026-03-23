//  parseDouble()  method  demo  program
class  prog6
{
	public  static void  main(String[]  args)
	{
		System . out . println(Double . parseDouble("10.8")); // Converts  "10.8"  to  10.8
		System . out . println(Double . parseDouble("25")); // Converts  "25"  to  25.0
		System . out . println(Double . parseDouble("0075")); // Converts  "0075"  to  75.0
		System . out . println(10.8 + ""); //  10.8 + "" = "10.8"  i.e.  Converts  10.8  to  "10.8"
	}
}
 
 
/*
parseDouble()   method
---------------------------
1) What  does  parseDouble()  method  do ?  --->  Converts  string  number  to  double
 
2) What  is  the  argument  of  parseDouble()  method ?  --->  Any  string  number
 
3) Double . parseDouble("10.8");
    Why  is  it  called  thru  classname  Double ?  ---> Since  it  is  a  static  method  of  Double  class
 
4) How  to  convert  double  to  string  ?  --->  Concatenate  with  ""
*/
