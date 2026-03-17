// Find  output  (Home  work)
import  java . util . Date;
import  java . sql . *;
class  prog1a
{
	public  static  void  main(String[]  args)
	{
		Date   d = new  Date();  //  Creates  java . util . Date  class  object
		System . out . println(d . getClass() . getName()); //  class  name  of  object  'd'  i.e.  java . util . Date
	}
}

/*
1) Where  is  Date  class  defined ?  --->  In  java . util  package ,  java . sql  package and  also  in  current  working  directory

2) Which  classes  have  got  highest  priority ?  --->  Those  classes  which  are  imported  explicitly
    Which  classes  have  got  2nd  highest  priority ?  --->  Classes  of  same  package  i.e.  current  working  directory
    Which  classes  have  got  lowest  priority ?  ---> Those  classes  which  are  imported  implicitly
	

Note:
1) What  does   sanaa . getClass() . getName()  return ? --->  Human  being

2) What  does  Tiger . getClass() . getName()  return ?  ---> Animal

3) What  does  Apple . getClass() . getName()  return ? --->  Fruit

4) What  does  "Hyd" . getClass() . getName()  return ? ---> java . lang . String
*/
