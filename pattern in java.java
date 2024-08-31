package onlinvedio;

public class Demo {

	public static void main(String[] args) {
   /* 
    * 0 1 2 3
     0* * * * 
     1* * * *
	 2* * * *
     3* * * *
     
	for(int i=0;i<4;i++)  //i=0,1,2,3  row
	{
		for(int j=0;j<4;j++) //j=0,1,2,3  column
		{
		
			System.out.print("*");
		
	}System.out.println();
}*/
    /*   0 1 2 3
     0 * * * *
     1 *     *
     2 *     *
     3 * * * * 
       
		for(int i=0;i<4;i++)  //i=0,1,2,3  row
		{
			for(int j=0;j<4;j++) //j=0,1,2,3  column
			{
			    if(i==0 ||i==3 || j==0 || j==3)
				System.out.print("*");
			    else 
			    	System.out.print(" ");
			 
			}System.out.println( );}
    same but row,column using model
		int row=4;
		int col=4;	
		for(int i=0;i<row;i++)  //i=0,1,2,3  row
{
	for(int j=0;j<col;j++) //j=0,1,2,3  column
	{
	    if(i==0 ||i==row-1 || j==0 || j==col-1)
		System.out.print("*");
	    else 
	    	System.out.print(" ");
	 
	}System.out.println( );
}*/   
 /*  1
  *  2 2 
  *  3 3 3
  *  4 4 4 4
	
		int row=4;	
		for(int i=1;i<=row;i++)  //i=0,1,2,3  row
{
	for(int j=1;j<=i;j++) //j=0,1,2,3  column
	{
	   
	    	System.out.print(i);
	 
	}System.out.println( );}  */
		  
		
	/*  1 
	 *  1 2
	 *  1 2 3
	 *  1 2 3 4
	 
		int row=4;	
		for(int i=1;i<=row;i++)  //i=0,1,2,3  row
{
	for(int j=1;j<=i;j++) //j=0,1,2,3  column
	{
	   
	    	System.out.print(j);
	 
	}System.out.println( );}*/ 
		
	/*  *
	 *  * *
	 *  * * *
	 *  * * * *
	 
		int row=4;	
		for(int i=1;i<=row;i++)  //i=0,1,2,3  row
{
	for(int j=1;j<=i;j++) //j=0,1,2,3  column
	{
	   
	    	System.out.print("*");
	 
	}System.out.println( );}  */
		
		} }

