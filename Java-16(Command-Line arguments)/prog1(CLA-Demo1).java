// Command  line  arguments  demo  program
import  java . util . Arrays;
class   prog1
{
	public static void main(String[]  args)
	{
		System . out . println("Number  of  inputs : " + args . length);  //  5 :  Number  of   inputs  passed  from  command  line
		for(int i = 0 ; i <= args . length - 1 ; i++)
				System . out . println("args [ " + i + " ] : " + args[i]); //   args[0] :  25  <next line>  args[1] :  Rama  Rao  <next line>   args[2] :   10000.0  <next line>   args[3] : m  <next line>   args[4] :  true  <next line>
		System . out . println(Arrays . toString(args));   //  [25 , Rama  Rao , 10000.0 , m , true]
	}
}





/*
1) java   prog1   25   "Rama  Rao"   10000.0   m    true
    What  is  the  value  of  args . length ?  ---> 5
	What  is  the  value  of  args[1] ?  ---> "Rama  Rao"

2) java   prog1   25    Rama   Rao   10000.0   m    true
    What  is  the  value  of  args . length ?  ---> 6  becoz  Rama  Rao  is  not  in  quotes
	What  is  the  value  of  args[1] ?  ---> "Rama"
	What  is  the  value  of  args[2] ?  ---> "Rao"

3) java   prog1
    What  is  the  value  of  args . length ?  ---> 0
	What  is  args[0] ?  ---> Throws   error  becoz  index  0  does  not  exist

4) What  is  args . length  in  general ?  --->  Number  of  inputs  passed  from  command  line

5) What  are  the  indexes  of  inputs ?  --->  0  to  args . length - 1

6) java  classname  input1   input2   input3  .....
     Does  args  array  contain  classname ?  --->  No  i.e. args  array  contains  only  inputs  but  not  classname
*/
