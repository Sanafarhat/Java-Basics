// max()  and  min()  methods  demo  program
class  prog5 
{
    public  static  void  main(String[]  args) 
	{
        System . out . println(Math . max(10 , 20)); // 20
        System . out . println(Math . max(10.8 , 20.6)); // 20.6
        System . out . println(Math . max('g', 's')); //  Unicode  value  of  's'  i.e.  115
        System . out . println((char) Math . max('g' , 's')); // (char)115 =   's'
        //System . out . println(Math . max("Rama" , "Rajesh")); // Error:  No  max(String , String)  method  in  Math  class
        System . out . println(Math . min(10 , 20)); // 10
        System . out . println(Math . min(10.8 , 20.6)); //10.8
        System . out . println(Math . min('g' , 's'));  //  Unicode  value  of  'g'  i.e. 103
        System . out . println((char) Math . min('g' , 's')); // (char)103 =  'g'
        //System . out . println(Math . min("Rama" , "Rajesh")); // Error:  No  min(String , String)  method  in  Math  class
    }
}


/*
max()  and  min()  methods  
------------------------------
1) What  are  the  arguments  of  max()  and  min()  methods ?  ---> Anything  except  char ,  boolean  and  String 

2) Which  method  is  executed  for  max(char , char) ?  ---> max(int , int)  method  and  char  is   typecasted  to  int
*/
