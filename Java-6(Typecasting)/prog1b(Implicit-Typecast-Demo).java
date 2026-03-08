//  Implicit  typecasting  demo  program (Home  work)
class  prog1b 
{
    public  static  void  main(String[]  args) 
	{
        double  a = 10.8f; // float value is converted to double value  i.e.  10.8
        double  b = 20L; //  long is converted to double i.e. 20.0
        double  c = 30; // int is converted to double i.e. 30.0
        float  d = 40L; //  long is converted to float i.e. 40.0f
        float  e = 50; // int is converted to float i.e. 50.0f
        //float  f = 62.8; // Error:  double  cannot  be  converted  to float
        long  g = 23; // int is converted to long i.e. 23L
        //long  h = 46.9f; // Error:  float  cannot  be  converted  to  long
        //long  i = 23.9; // Error:  double  cannot  be  converted  to long
        int  j = 'A'; // char is converted to int i.e. 65 
		//int  k = 25L; // Error:  long  cannot  be  converted  to int 
        //int  l = 78.3f;  // Error:  float  cannot  be converted  to int
        //int  m = 10.8; // Error:  double  cannot  be  converted   to int
        char  ch = 90; // int is converted to char i.e.  'Z'
        System . out . println("a :  " + a); // a : 10.8 
        System . out . println("b :  " + b); // b : 20.0
        System . out . println("c :  " + c); // c : 30.0
        System . out . println("d :  " + d); // d : 40.0
        System . out . println("e :  " + e); // e : 50.0
        System . out . println("g :  " + g); // g : 23
        System . out . println("j :  " + j); // j : 65
        System . out . println("ch :  " + ch); // ch : Z
    }
}
