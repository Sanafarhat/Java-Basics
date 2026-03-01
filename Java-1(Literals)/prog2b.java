// int  demo  program
class  prog2b
{
	public  static  void   main(String[]   args)
	{
		int  x = 25;   //  'x'  is   an  int  variable  with  value  25  
		System . out . println(x); //  Value  of  'x'  i.e.  25
		//x = 1,000;  //   Error  due  to  comma
		//x = $75;    //   Error  due  to   $
		//x = 1,00,000;  //   Error  due  to  comma
	}
}


/*
1) What  is  the  extension  of  java  program  file ? ---> .java

2) How  to  compile  the  program ? --->  javac  filename . java
    
3) javac  prog2b.java
    What  does  compiler  do ?  ---> Translates  source  code  to  byte  codes

4) Where  are  the  byte  codes  saved ?  --->  In  prog2b . class  file

5) How  to  run  a  class ? --->  java  classname

6) java  prog2b
    What  does  jvm  do ?  --->  Translates  byte  codes  to  machine  codes  and  executes  machine  codes

7) java  prog2b . class
     Is  the  command  valid ? --->  No  becoz  extension  is  not  permitted  to  run  a  class

8) In  other  words,  extension (i.e.  java)  is  mandatory  to  compile  a  program  and
    extension  is  not  permitted  to  run  a  class

9) java  prog2b
    Which  method  is  executed ? --->  main()  method  of  prog2b.class  file
*/
