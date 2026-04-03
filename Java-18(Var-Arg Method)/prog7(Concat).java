//  Write  a  program  to  concatenate  strings  passed  from  method  call   (Home  work)
class  prog7
{
	public  static  String  concat(String...   a)  //  Ref  'a'  points  to  array  of  strings  passed   from  method  call
	{
		String  result = "";
		for(String  s  :  a)  //  's'  is  each  string  of  array  'a'
				result += s + " ";  //  result =  "" + "Sankar" + " " + "Dayal" + " " + "Sarma" + " "
		return  result;  //  Concatenation of  all  the  strings  in  array  'a'
	}
	public  static  void  main(String[]  args)
	{
		System . out . println(concat("Sankar" , "Dayal" , "Sarma")); //  Array  of  3  strings  is  passed  to  the  method  i.e.  Sankar Dayal Sarma
		System . out . println(concat("Hyd" , "Is" , "Green",  "City"));   // Hyd<space>Is<space>Green<space>city
		System . out . println(concat("Java" , "Is" , "A" , "Great" ,  "Language"));   // Java<space>Is<space>A<space>Great<space>Language
		System . out . println(concat());   // ""
		System . out . println(concat("Srinivas"));  // Srinivas
		System . out . println(concat(new  String[]  {"C" , "C++" , "Java" , "Python"}));  // C<space>C++<space>Java<space>Python
	}
}
