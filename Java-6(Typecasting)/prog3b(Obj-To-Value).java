// Find  outputs   (Home  work)
class  prog3b 
{
    public  static  void  main(String[]  args) 
	{
        String  a = "25";
        //System . out . println((int)a);  //  Error :  class  String  can  not  be  typecasted  to  datatype  int
        System . out . println(Integer . parseInt(a));  //   parseInt("25")  is  25
        String  b = "10.8";
        //System . out . println((double) b); // Error :  class  String  can  not  be  typecasted  to  datatype  double
        System . out . println(Double . parseDouble(b));  //  parseDouble("10.8")  is   10.8
        String  c = "true";
        //System . out . println((boolean) c); // Error :  class  String  can  not  be  typecasted  to  datatype  boolean
        System . out . println(Boolean . parseBoolean(c));  //  parseBoolean("true")  is  true
        String  d = "g";
        //System . out . println((char) d); // Error :  class  String  can  not  be  typecasted  to  datatype  char
        //System . out . println(Character . parseCharacter(d)); // Error : No  parseCharacter()  method  in  Character  class
        //System . out . println(d[0]); //  Error :  'd'  is  not  an   array
        System . out . println(d . charAt(0));  //   "g" . charAt(0)  is   'g'
    }
}


/*
1) Can  String  be  typecasted  to  int , double , char  and  boolean ?  --->  																																					
													No  becoz  class (such  as  String) can  not  be  typecasted  to  datatype  (such  as  int)

2) How  to  convert  string  to  integer ?  --->  With  parseInt()  method  of  Integer  class
    How  to  convert  string  to  double ?  ---> With  parseDouble()  method  of  Double  class
    How  to  convert  string  to  boolean ? ---> With  parseBoolean()  method  of  Boolean  class
    How  to  convert  string  to  character ?  --->  With  charAt()  method  of  String  class
*/
