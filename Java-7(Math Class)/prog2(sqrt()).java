// sqrt()  method  demo  program
class  prog2 
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . sqrt(25));  // 5.0
        System . out . println(Math . sqrt(10));  // 3.16
        System . out . println(Math . sqrt(Math . sqrt(256))); //  Math . sqrt(16.0) = 4.0
        System . out . println(Math . sqrt(Math . pow(3 , 4))); // Math . sqrt(81.0) = 9.0
        System . out . println(Math . sqrt(-49));  // NaN :    sqrt(-ve  number)  can  not  be  determined
        //int x = Math . sqrt(49); // Error:  Mismatch  in  types  i.e.  int  and  double
        //System . out . println(sqrt(25)); // Error :  No   sqrt()  method  in  same  class  i.e.  prog2   class
    }
}

 
/*
sqrt()  method
-----------------
1) What  does  sqrt(x)  do  ? --->  Returns  square  root  of  number  'x'

2) Math . sqrt(x)
    Why  is  sqrt()  method  called  thru  classname  Math ?  ---> Since  it  is  a  static  method  of  Math  class

3) What  is  the  result  of  sqrt(25) ?  --->  5.0  but  not  5  becoz  return  type  of  sqrt()  method  is  double

4) What  is  the  result  of  sqrt(negative-number) ?  --->  NaN  becoz  sqrt  of  -ve  value  can  not  be  determined
*/
