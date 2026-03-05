//  Find  outputs  (Home  work)
class  prog4b 
{
	public  static  void  main(String[]  args)
	{
		long  x = 10000000L;  //  'x'  is  long  vaiable  with  value  10000000
		System . out . println(x); // Value  of  'x'  i.e.  10000000
		System . out . println(Long . SIZE); // size  of  long  i.e. 64  bits
		System . out . println(Long . MAX_VALUE); // max  value  of  long  i.e.  2 ^ 63 - 1
		System . out . println(Long . MIN_VALUE);  // min  value  of  long  i.e.  -2 ^ 63
		//int  y  = 75L; // Error:  Mismatch  in  types   i.e.  y is int variable and 75L is long 
		//System . out . println(long . MIN_VALUE); //  Error :  long  is  not  a  class
		//long  int  y  =  25; // Error :  No  datatype long int
	}
}


/*
1) What  are  SIZE , MAX_VALUE  and  MIN_VALUE  called ? ---> final  static  variables  of  Long  class

2) int  y = 75L;
    What  is  the  issue  with  the  statement ?  ---> 
															int  variable  (i.e.  4-byte  variable)  can  not  hold   long  integer  (i.e.  8 - byte  value)
*/
