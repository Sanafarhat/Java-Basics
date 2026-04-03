// Find  outputs  (Home  work)
class  prog3a
{
	public   static  void  m1(int  i)
	{
		System . out . println("m1(int)  method :  " + i);
	}
    public   static  void  m1(float  f)
	{
		System . out . println("m1(float)  method :  " + f);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  //  m1(int) method : 25
		m1(10.8f); //   m1(float)  method :  10.8
		m1('A');  //   m1(int)  method :  65
		m1(75L);  //  m1(float)  method :  75.0
		//m1(24.6); // Error:  double  can  not  be  converted  to  int  (or)  float
	}
}


/*
1) byte  --->  short  --->  int  ---->   long  ---->   float  ---->   double

2) char  --->  int  and  vice  versa

3) What  is  the  difference  between  10.8f , 10.8  and  10.8d ?  --->  10.8f  is  float   due  to  'f'
																								              10.8   and  10.8d  are  double

4) What  is  the  difference  between  25  and  25L  ? --->  25  is  integer  and  25L  is   long  integer  due  to  L

5) Is  double  typecasted  implicitly ?  ---> No

6) How  to  call  m1()  method  if  it  is  not  a  static  method ? --->  prog3  obj = new  prog3()
																										   obj . m1(arg);
*/
