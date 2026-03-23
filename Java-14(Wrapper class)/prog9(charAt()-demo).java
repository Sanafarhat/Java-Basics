// How  to  convert  string  to  character ?
class  prog9
{
	public  static void  main(String[]  args)
	{
		System . out . println("Hyd".charAt(0));  //  Character  at  index  0  of  "Hyd"  i.e. 'H'
		System . out . println("Hyd".charAt(1));  //  Character  at  index  1  of  "Hyd"  i.e. 'y'
		System . out . println("Hyd".charAt(2));  //  Character  at  index  2  of  "Hyd"  i.e. 'd'
		//System . out . println(Character . parseChar("g")); // Error:   No  parseChar() method  in  Character  class
		System . out . println("g" . charAt(0));  //  Converts  "g"  to  'g'	
		System . out . println('g' + "");  //  'g' + "" = "g"  i.e.  Converts  'g'  to  "g"
	}
}


/*
1) How  to  convert  string  to  character ?  --->  With  charAt()  method

2) How  to  convert  character  to  string ?  ---> Concatenate  with  ""
*/
