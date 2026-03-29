// Find  outputs
class  prog2
{
	public  static void  main(String[]  args)
	{
		int[][]   a = {{10 , 20} , {30 , 40 , 50} , {60 , 70 , 80 , 90}};
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i].length);// 2  <next  line>  3  <next  line>  4  <next  line>
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			     System.out.print(a[i][j] + "\t"); // How  to  print  elements   of  each   row  in  matrix  style
			System.out.println();
		}
	}
}

/*
10     20
30     40     50
60     70     80    90
*/
