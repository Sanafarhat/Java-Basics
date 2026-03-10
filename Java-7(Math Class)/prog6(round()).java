// round()  method  demo  program
class  prog6 
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . round(10.8));  //  Integer  part  of  (10.8 + 0.5) = 11
        System . out . println(Math . round(10.2));  // Integer  part  of  (10.2 + 0.5) =10
        System . out . println(Math . round(10.5));  //  Integer  part  of  (10.5 + 0.5) =11
        System . out . println(Math . round(-10.8)); //  Integer  part  of  (-10.8 - 0.5) = -11
        System . out . println(Math . round(-10.2)); // Integer  part  of  (-10.2 - 0.5) = -10
    }
}

/*
round()  method
-------------------
1) What  does  round(positive-value)  do ?  --->  Returns  integer  part  of  (positive-value + 0.5)
 
2) What  does  round(negative-value)  do ?  --->  Returns  integer  part  of  (negative-value - 0.5)
*/
