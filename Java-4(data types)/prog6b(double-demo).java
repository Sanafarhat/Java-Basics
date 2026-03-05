//  Find  outputs  (Home  work)
class prog6b 
{
	public static  void  main(String[]  args)
	{
		double  x = 10.8;  //  'x'  is  double  variable  with  value  10.8
		System . out . println(x); // Value of 'x' i.e 10.8
		System . out . println(Double . SIZE); // size  of  double  i.e. 64  bits
		System . out . println(Double . MAX_VALUE); // max  value  of  double  i.e.  1.79 * 10 ^ 308
		System . out . println(Double . MIN_VALUE); //  min  value  of  double  i.e.  4.9 * 10 ^ -324
		x = 25.6d; 
		System . out . println(x); //  Value of x   i.e.  25.6 
		x = 34.9f; //  Valid  :  double  variable  can  hold  float  value
		System . out . println(x); //  Value of x   i.e.  34.9
		//long  float  y  =  45.3; // Error :  No  datatype long float
	}
}


/*
1) float  x = 10.8;
    Can  float  variable  hold  double  number ?  ---> No  becoz  4 - byte  variable  can  not  hold  8-byte  number

2) double  m = 25.4f;
    Can  double  variable  hold  float  number ?  ---> Yes  becoz  8 - byte  variable  can  hold  4-byte  number
*/
