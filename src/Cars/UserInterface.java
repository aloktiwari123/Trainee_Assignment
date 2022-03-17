package Cars;

import java.util.Scanner;

public class UserInterface {
	
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		char status;
		do
		{	new CarAdmin().main(args);;
			System.out.println("Do you want to enter details of any other car(y/n)");
			status=sc.next().charAt(0);
			
		}while(status!='n');
	}
}
