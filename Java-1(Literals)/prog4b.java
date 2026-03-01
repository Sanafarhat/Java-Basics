//  Find  outputs
class  prog4b
{
	public  static  void   main(String[] args)
	{
		float   a = 10.8f;    //  'a'  is  float  variable  with  value  10.8
		System . out . println(a); //   Value  of  'a'  i.e. 10.8
		a = 10.8E3f;  // 10.8 * 10 ^ 3
		System . out . println(a); //   10800.0
		a = 123.0274E-3f;  //  123.0274 * 10 ^ -3
		System . out . println(a); //  0.1230274
		a = 25.f;  //  Valid  and  is  interprted  as  25.0
		System . out . println(a); //  25.0
		a = .1234f;  //  Valid  and  is  interprted  as   0.1234
		System . out . println(a); //  0.1234
		//a = 9.8.2;  // Error due  to  two decimal points
		//a = 25.4;  // Error due  to  mismatch :  float   variable  can  not  hold  double  value
	}
}

 
/*
1) How  to  compile  the  program ?  ---> javac  prog4b . java

2) javac  prog4b
    Is  the  command  valid ?   --->  No  becoz  .java  extension  is  missing

3) javac  prog4b.java
    What  does  compiler  generate  when  the  program  is  compiled ?  --->  prog4b.class

4) How  to  run  the  class ?  ---> java   prog4b

5) java  prog4b.class
    Is  the  command  valid ?   ---> No  becoz  extension  is  not  permitted  to   run  the  class
*/
