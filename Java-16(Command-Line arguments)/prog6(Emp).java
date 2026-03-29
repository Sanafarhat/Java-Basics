/*
Write  a  program  to  print  employee  data  passed  from  command  line
1) java  emp   25    "Rama  Rao"   10000.0     m     true
    What  are  the  outputs ?  --->  Print  all  the  inputs

2) java  emp
    What  is  the  output ?  ---> Pls  send  inputs
*/
class  emp
{
	int  empno;
	String  ename;
	double  sal;
	char  gender;
	boolean  married;
	public  static  void  main(String[]   args)
	{
		try
		{
			emp a = new emp(); //  Creates  emp  class  object  with  5  variables  i.e.  empno = 0 , ename = null , sal = 0.0 , gender = '\0' , married = false
			a.empno = Integer.parseInt(args[0]); // How  to  copy  1st  input  from  args  array  to  object  'a'
			a.ename = args[1]; // How  to  copy  2nd  input  from  args  array  to  object  'a'
			a.sal = Double.parseDouble(args[2]); // How  to  copy  3rd  input  from  args  array  to  object  'a'
			a.gender = args[3] . charAt(0); // How  to  copy  4th   input  from  args  array  to  object  a''
			a.married = Boolean.parseBoolean(args[4]); // How  to  copy  5th  input  from  args  array  to  object  'a'
			System . out . println("Emp  number :  " + a.empno);
			System . out . println("Emp  name :  " + a.ename);
			System . out . println("Salary : " + a.sal);
			System . out . println("Gender :  " + a.gender);
			System . out . println("Married : " + a.married);
		}
		catch(ArrayIndexOutOfBoundsException    e)
		{
				System . out . println("Send  inputs  in  the  order  empno , ename , salary , gender , marital-status");
		}
		catch(NumberFormatException    e)
		{
				System . out . println("Ename  should  be  in  double  quotes  (or)  inputs  should  be  in  the  order  empno , ename , salary , gender , marital-status");
		}
	}
}


// Object  'a' --->  empno = 25 , ename = "Rama Rao" , sal = 10000.0 , gender = 'm' , married = true



/*
1) java  emp
    Which  statement  throws  error ?  --->  args[0]  throws  ArrayIndexOutOfBoundsException  becoz  index  0  does  not  exist

2) java   emp   25   Rama  Rao   10000.0    m    true
    Which  statement  throws  error ?  --->  Double . parseDouble("Rao")  throws  NumberFormatException

3) What  is  the  order  of  inputs ?  --->  empnumber ,  empname  , salary ,  gender  , married

4) How  to  convert  string  to  integer ? --->  With  parseInt()  method
    How  to  convert  string  to  double ? --->  With  parseDouble()  method
    How  to  convert  string  to  boolean ? ---> With  parseBoolean()  method
    How  to  convert  string  to  character ? --->  With  charAt(0)  method

5) What  does   "m" . charAt(0)  do ? --->  Converts   "m"   to  'm'

6) command  line  inputs  -------->   args  array   --------------------->  object  'a'   -------------->  console
                                         JVM                             main()  method                             println()
*/
