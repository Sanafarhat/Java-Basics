// Identify  Error (Home  work)
class  prog2
{
	public  int  m1(int  x , int  y)   //  Valid
	{
		return  25;
	}
	public  double  m1(int  a , int  b) // Error due  to  same  signature
	{
		return  10.8;
	}
}


/*
1) Both  the  methods  have  got  same  signature  which  is  not  permitted

2) Is  return  type  a  part  of  the  signature ?  --->  No

3) Are  argument  names  a  part  of  the  signature ?  ---> No

4) What  is  signature ?  --->  Types  of  parameters
*/
