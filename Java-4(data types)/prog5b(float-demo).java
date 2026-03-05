//  Find  outputs
class  prog5b 
{
    public  static  void  main(String[]  args)
	{
        float  x = 10.8f; // 'x'  is  float  variable  with  value  10.8
        System . out . println(x); // Value of 'x' i.e.  10.8
        System . out . println(Float . SIZE); // size  of  float  i.e. 32  bits
        System . out . println(Float . MAX_VALUE);  // max  value  of  float  i.e. 3.4 * 10 ^ 38
        System . out . println(Float . MIN_VALUE);  // min value of float i.e.  1.4  * 10 ^ -45
        //float  y = 25.6; // Error:   Mismatch  in  types  i.e. y is float variable and 25.6 is double
    }
}


/*
1) What  are  SIZE , MAX_VALUE  and  MIN_VALUE  called  ? ---> final  static  variables  of  Float  class

2) float  y = 25.6;
    What  is  the  issue  with  the  statement ?  ---> 
													float  variable  (i.e.  4-byte  variable)  can  not  hold   double  value  (i.e.  8 - byte  value)
*/
