import java.util.Scanner;


public class Fibo {
	int n1,n2,n3,limit;
	   
    Fibo(int n)
    {
    	limit = n;
        n1=0;
        n2=1;	
    }
    void series()
    {
    	System.out.println("The Fibonacci Series is:");
        System.out.print(n1+" "+n2+" ");
        int i;
        for(i=3;i<=limit;i++)
        {
        	n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    
    }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the Limit");
	        int n = sc.nextInt();
	        Fibo f= new Fibo(n);
	        f.series();
	        
		
		

	}

}
