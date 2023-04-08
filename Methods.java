package Functions;

import java.util.Scanner;

class Metho
{
	Scanner sc=new Scanner(System.in);
	String lb[]= {"Maths","Physics","Chemistry"};
	int lbprice[]= {100,200,300};
	String a;
	int cost;
	int tot;
	int a1;
	int i;
	void librery()
	{
		for(i=0;i<=lb.length-1;i++) {
	System.out.println(lb[i]);
	}
	System.out.println("Enter the subject name : ");
	}
	void compare()
	{
		a=sc.next();
		for(i=0;i<=lb.length-1;i++)
		if(a.equalsIgnoreCase(lb[i]))
		{
			System.out.println("How many " +a+ " books do you want ?");
			a1=sc.nextInt();
			cost=a1*lbprice[i];
			System.out.println(cost);
			System.out.println("Are you want any other books means please let me know Yes/No:");
			String b=sc.next();
			
			if(b.equalsIgnoreCase("yes"))
			{
				System.out.println("Which books do you want : ");
				for(i=0;i<=lb.length-1;i++)
				{
				System.out.println(lb[i]);
				}
			}
			else if(b.equalsIgnoreCase("no"))
			{
				System.out.println("Thankyou!!");
				break;
			}
			System.out.println("ENTER A BOOK ?");
			a=sc.next();
			for(i=0;i<=lb.length-1;i++)
			if(a.equalsIgnoreCase(lb[i]))
			{
				System.out.println("How many books do want : ");
				a1=sc.nextInt();
				int cost1=a1*lbprice[i];
				System.out.println(cost);
				tot=cost+cost1;
				System.out.println("Total books cost : "+tot);
			}
		}
	}	
}
public class Methods {

	public static void main(String[] args) {
		Metho m1=new Metho();
		m1.librery();
		m1.compare();

	}

}
