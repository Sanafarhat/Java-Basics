// pow()  method  demo  program
class  prog1 
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . pow(2 , 3)); // 2 ^ 3 = 8.0
        System . out . println(Math . pow(10 , -2)); // 10 ^ -2 = 1 / 100 = 0.01
        System . out . println(Math . pow(-3 , -4)); // -3 ^ -4 = 1/81
		System . out . println(Math . pow(2 , Math . pow(3 , 2))); //  Math . pow(2 , 9) = 512.0
        //int  x = Math . pow(9 , 2);  // Error:  Mismatch  in  types  i.e.  int  and double
        //System . out . println(pow(8 , 2)); // Error :  No  pow()  method  in  same  class  i.e.  prog1  class
        //Math  m = new  Math(); // Error :  Math  class  object  can  nor  be  created  due  to  private  constructor  in  Math  class
    }	
}

 /*
pow()  method
-----------------
1) What  does  pow(a , b)  do  ?  ---> Returns   a ^  b
 
2) Math . pow(a , b);
    Why  is  pow()  method  called  thru  classname  Math ?  ---> Since  it  is  a  static  method  of  Math  class
 
3) What  is  the  result  of  pow(3 , 4) ?  --->  81.0  but  not  81  as  return  type  of  pow()  method  is  double
 
4) What  is  a  nested  call ?  --->  A  method  call  in  another  method  call
 
5) Math . pow(a , Math . pow(b , c));
    Which  call  is  executed  first ?  ---> Inner  call  is  executed  before  outer  call
*/
 