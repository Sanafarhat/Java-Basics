// floor()  and  ceil()  methods  demo  program
class  prog4 
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . floor(10.8));  // Nearest  previous  integer  of  10.8  i.e.  10.0
        System . out . println(Math . ceil(10.8));   // Nearest  next  integer  of  10.8  i.e.  11.0
        System . out . println(Math . floor(25.0));  // Nearest  previous  integer  of  25.0  i.e.  25.0
        System . out . println(Math . ceil(25.0));   // Nearest  next  integer  of  25.0  i.e.  25.0
        System . out . println(Math . floor(-3.5));  // Nearest  previous  integer  of  -3.5  i.e.  -4.0
        System . out . println(Math . ceil(-3.5));   //  Nearest  next  integer  of  -3.5  i.e.  -3.0
        System . out . println(Math . floor(-9.0));  // Nearest  previous  integer  of  -9.0  i.e.  -9.0
        System . out . println(Math . ceil(-9.0));   //  Nearest  next  integer  of  -9.0  i.e.  -9.0
        System . out . println(Math . floor(25.2));  // Nearest  previous  integer  of  25.2  i.e.  25.0
        System . out . println(Math . ceil(25.2));   //  Nearest  next  integer  of  25.2  i.e.  26.0
        System . out . println(Math . ceil(10));     // Nearest  next  integer  of  10  i.e.  10.0
    }
}

 
/*
floor()  and  ceil()  methods
--------------------------------
1) What  does  floor(x)  do ?  ---> Returns  nearest  previous  integer  of  'x'  with   .0
    What  does  ceil(x)  do ?  ---> 	Returns  nearest  next  integer  of  'x'  with  .0
 
2) What  is  the  return  type  of  floor()  and  ceil()  methods  ? --->  double  but  not  int
*/
 