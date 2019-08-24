import java.util.*;

public class Main
{
	public static void main(String[] args)
	{  Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int row=scanner.nextInt();
	   for(int i=1;i<=row;i++){
		   for(int j=row;j>=i;j--){
			   System.out.print(j);
		   }
		   System.out.println();
	   }
		
		
		
	}
}
/* o/p format
   *******
   ******
   *****
   ****
   ***
   **
   *    
      */
