// Find  outputs  (Home  work)
class  prog1d
{
	public  static  void  main(String[]  args)
	{
		char[]  a = {'H' , 'y' , 'd'};
		System . out . println("Character  Array");
		for(char  ch : a)  //  ch  is  each  char  of  array  'a'
	    		System.out.println(ch); // H  <next  line> y  <next  line> d  <next  line>
		String[]  b = {"Hyd" , "Pune" , "Chennai" , "Vijayawada"};
		System . out . println("String   Array");
		for(String  s : b)  //  's' is  each  string  of  array  'b'
			System.out.println(s); //  Hyd  <next  line>  Pune  <next  line>  Chennai <next  line>  Vijayawada  <next  line>
		int[][]  c = {{10 , 20} , {30 , 40 , 50} , {60 , 70 , 80 , 90}};
		System . out . println("Jagged   Array");
		for(int[]  x : c)  //  'x'  is  each  row  of  array  'c'
		{
		    for(int y : x)  //  'y'  is  each  element  of  row  'x'
						System.out.print(y + "\t");
		    System.out.println();
		}
	}
}


/*
Where  does  ref  'x'  points ?       y
-------------------------------------------------
                   1st  row                        10
                                                        20
                   2nd  row                       30
                                                        40
                                                        50
                   3rd  row                       60
	                                                    70
	                                                    80
	                                                    90
*/
