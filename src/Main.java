import java.util.*;

public class Main
{
	public static void main(String[] args)
	{{  Scanner scanner=new Scanner(System.in);
System.out.println("Enter no.of rows");
			int row=scanner.nextInt();
			for(int i=1;i<=row;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j);
				}
				System.out.println();
			}
			for(int a=1;a<=row;a++){
				for(int b=row-1;b>=a;b--){
					System.out.print(b);
				}
				System.out.println();
			}
		}


	}
	/*  output format
	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 *     */
		
}
