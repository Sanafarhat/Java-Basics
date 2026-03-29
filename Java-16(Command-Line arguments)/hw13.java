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
        m1(25 , 30.2f); // m1(int , float)  : 25 <tab> 30.2
        m1(45.6f , 65); // m1(float, int)  : 45.6 <tab> 65
        m1(10 , 20); // m1(int , int)  : 10 <tab> 20.0
        m1(10.6f , 20.8f);  // m1(float , float)  : error
        m1(10.6 , 20.8); // m1(double , double)  : 10.6 <tab> double cannot be converted to int so error
    } 
}