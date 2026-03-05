//  Tricky  program
//  Find  output  (Home  work)
class prog8c 
{
    public static void main(String[] args) 
	{
        if(1)  // Error:  1  is  neither  true  nor  false
            System.out.println("Hyd"); 
        else
            System.out.println("Sec");
        while(0) // Error:  0  is  neither  true  nor  false
            System.out.println("Hello");
    }
}


/*
What  does  if  and  while  demand ?  ---> true  (or)  false but  not  1  and  0
*/
