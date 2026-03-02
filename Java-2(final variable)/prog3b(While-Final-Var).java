/*
Can  the  program  be  compiled ?
 
Hint: final  variable  is  expanded  at  compile  time
*/
class prog3b 
{
    public static void main(String[] args) 
	{
        final  int a = 10, b = 20;
        while (a < b)  // 10 < 20  is   always  true
            System.out.println("Hello"); 
        //System.out.println("Bye");  //  Compile  time  error :  Not  executed 
    }
}


/*
1) When  are  10  and  20  substituted  for   'a'  and  'b' ?  ---> At  compile  time

2) What  is  the  issue  with  System . out . println("Bye")  ?  --->
															It  is  not  compiled  due  to  infinite  loop  and  hence  compiler  throws  error

3) Is  the  program  compiled  without  System . out . println("Bye") ?  --->  Yes

4) What  are  the  outputs  without  System . out . println("Bye") --->  Hello  infinite  times 
*/
