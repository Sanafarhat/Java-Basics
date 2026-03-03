// Find  outputs  (Home  work)
class  prog3 
{
    public  static  void  main(String[]  args) 
	{
        String  a = "Hyd";
        int  b = 10, c = 20, d = 30;
        a = a + b + c;  //  a = "Hyd" + 10 + 20  --->  a = "Hyd10" + 20   --->  a = "Hyd1020"
        System . out . println(a); // Hyd1020
        b = b + c + d;  // b = 10 + 20 + 30   --->  b = 60
        System . out . println(b); // 60
        //a = b + c + d; //  a = 10 + 20 + 30  --->  a = 60  ---> Mismatch  of  types  i . e .  String  and  int
        //b = a + c + d; //  b = "Hyd" + 20 + 30  --->  b = "Hyd2030"  --->  Mismatch  of  types  i . e .   int  and  String
    }
}


/*
1) String  a = 60;
    Is  the  statement  valid ?  --->  No  becoz  String  object  can  not  hold  an  integer  number 
	
2) int  b = "Hyd2030";
    Is  the  statement  valid ?  ---> No  becoz  int  variable  can  not  hold  string
*/
