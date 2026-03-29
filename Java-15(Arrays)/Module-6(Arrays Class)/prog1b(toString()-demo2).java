//  Find  outputs
import  java . util . Arrays;
class  prog1b
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		System . out . println(Arrays . toString(a));  // "[10,20,15,18]"
		System . out . println(a); // Executes toString() method  of  Object  class  which  returns  "[I@hexadecimal-hashcode-ofarray"
		char[]  b = {'H' , 'y' , 'd'}; //
		System . out . println(Arrays . toString(b)); // "[H,y,d]"
		System . out . println(b); //  println(char[])  method  prints  Hyd
		String[]  c = {"Hyd", "Pune" , "Chennai" , "Vijayawada"};
		System . out . println(Arrays . toString(c)); // "[Hyd, Pune , Chennai , Vijayawada]"
		int[][]  d = {{10 , 20} , {30 , 40 , 50} , {60 , 70 , 80 , 90}};
		for(int i = 0 ; i <= d . length - 1 ; i++)
				System . out . println(Arrays . toString(d[i])); //  [10,20]  <next  line> [30,40,50] <next  line> [60,70,80,90]  <next  line>
	}
}
