package com.sbi.bank;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
    Account act=new Account();
	Scanner inp=new Scanner(System.in);
	System.out.println("Welcome to SBI bank");
	int i=1;
	int money=0;
	boolean bool=true;
	do{
		System.out.println("Press 1 for balance enquiry");
		System.out.println("Press 2 for deposit");
		System.out.println("Press 3 for withdraw");
		System.out.println("Press 4 for exit");
		i=inp.nextInt();
		switch(i){
		case 1:act.viewBalance(); break;
		case 2:System.out.println("Enter the amount to be deposit");money=inp.nextInt();act.deposit(money);break;
		case 3:System.out.println("Enter the amount to be withdraw");money=inp.nextInt();act.withdraw(money);break;
		case 4:System.out.println("see you soon");i=4;break;
		}
		
	}while(i!=4);
	//Case loop
	
	
}
}
