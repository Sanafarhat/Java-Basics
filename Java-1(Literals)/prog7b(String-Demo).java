//  String  demo  program
class  prog7b
{
	public  static  void  main(String[]  args)
	{
		String  s =  "Rama Rao";  //  Ref  's'  points  to   object  "Rama  Rao"
		System . out . println(s); //  Value  of  object  's'  i.e. Rama Rao
		s =  "9247"; //  Ref  's'  is  modified  to   "9247" 
		System . out . println(s); // 9247
		s =  "+-$";  //  Ref  's'  is  modified  to   "+-$"
		System . out . println(s); // +-$
		s =  "A2#";  //  Ref  's'  is  modified  to   "A2#"
		System . out . println(s); //  A2#
		s =  "";  //  Ref  's'  is  modified  to   ""
		System . out . println(s); //  Nothing
		//s =  'g';  // Error:  String  object  can  not  hold  character
		//string  a; // Error:  No  class  called  string
	}
}


/*
1) Why  is  's'  capital  letter  in  String ?  --->  Since  String  is  a  class

2) Is  String  a  user  defined  class  (or)  pre-defined ?  --->  A  pre-defined  class  in  java . lang  package
    What  about  prog7b ?  ---> A  user  defined  class

3) What  is  the  difference  between  java  and  lang ?  --->  java  is  a  package  and  lang  is  a  subpackage

4) What  is  a  package ?  --->  A  group  of  clases  and  sub-packages
*/
