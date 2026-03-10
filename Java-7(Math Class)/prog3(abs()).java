// abs() method  demo  program
class  prog3
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . abs(-25)); // 25
        System . out . println(Math . abs(10)); // 10
        System . out . println(Math . abs(-49.6)); // 49.6
        System . out . println(Math . abs(79.2));  // 79.2
        //System . out . println(abs(-82)); // Error : No  abs()  method  in   same  class  i.e.  prog3  class
    }
}

 
 /*
abs()  method
----------------
1) What  does  abs(negative-value)  do ?  ---> Returns  positive  value
    What  does   abs(positive-value)  do ?   ---> Returns  same  value
 
2) Math . abs(x)
    Why  is  abs()  method  called  thru  classname  Math ?  ---> Since  it  is  a  static  method  of  Math  class

3) What  is  the  result  of  abs(integer) ?  ---> integer
    What  is  the  result  of  abs(double) ?  --->  double
 
4) What  is  the  return  type  of  abs()  method ?  ---> Same  as  argument  type
 
5) abs(x)  is  same  as  |x|
*/
 