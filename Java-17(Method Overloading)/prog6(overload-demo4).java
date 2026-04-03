// Find  outputs  (Home  work)
class prog6
{
    public  static  void  m1(int  i , double  d)
    {
        System . out . println("m1(int , double)  :  " + i + "\t" + d);
    }
    public  static  void  m1(double  d , int  i)
    {
        System . out . println("m1(double , int)  :  " + d + "\t" + i);
    }
    public  static  void  main(String[]  args)
    {
        m1(25 , 10.8);  // m1(int , double)  : 25 <tab> 10.8
        m1(30.4 , 37);  // m1(double , int)  : 30.4 <tab> 37
        m1(25 , 30.2f); // m1(int , double)  : 25 <tab> 30.2  (float  is   typecasted  to  double)
        m1(45.6f , 65); // m1(double , int)  : 45.6 <tab> 65  (float  is   typecasted  to  double)
        //m1(10 , 20); //  Error : Confusion  whether  to  execute  m1(int , double)   (or)  m1(double , int)
        //m1(10.6f , 20.8f);  //  Error :  float  can  not  be  converted  to  int
        //m1(10.6 , 20.8); // Error :  double   can  not  be  converted  to  int
    }
}

//  byte ---> short --->  int ---> long ---> float  ---> double
