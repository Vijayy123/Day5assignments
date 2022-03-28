package xyzbank;

import java.util.Scanner;

public class XyzBank {

	public static void main(String[] args) {
		
		Address addr = new Address();
		addr.setCity("venkatagiri");
		addr.setState("Karnataka");
		addr.setPincode("560068");
		
		AccountDetails ac = new AccountDetails();
		
		ac.setAddr(addr);
		ac.setAmount(1000);
		ac.setOwner_name("Vijay");
		ac.setStatus("active");
		ac.setAccType("savings");
		
		System.out.println(ac);
		int newBal = ac.getAmount();
		
		System.out.println("Enter your Choice \n1. Deposite \n 2. withdraw2");
		
		System.out.println("choose your option");
		
		Scanner sc  = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
		
		case 1: 
			System.out.println("Enter the deposite moneny ");
			int money = sc.nextInt();
			newBal += money;
			System.out.println("the New Bal is  "+ newBal);
			System.out.println(ac);
			break;
			
		case 2 : 
			System.out.println("Enter the withdraw moneny ");
			int withDraw = sc.nextInt();
			if(withDraw < newBal) {
				newBal -= withDraw;
				System.out.println("the new bal is " + newBal);
				System.out.println(ac);
			}
			else
			{
				System.out.println("the amount is insufficient");
			}
			break;
		
		}
		

	}

}
