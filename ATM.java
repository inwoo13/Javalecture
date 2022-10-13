package sevenweek;

import java.util.Scanner;

class Account{
	private int pin = 1234;
	int balance;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	public Account() {
		this.balance = 0;
		this.name = null;
	}
	public Account(String name) {
		super();
		this.balance = 0;
		this.name = name;
	}
	public int getBalance() {		return balance;}
	public void setBalance(int balance) {		this.balance = balance;}
	
	public void PIN_in() {		
		do {
			System.out.print("PIN을 입력하시오 : ");
			int PIN = sc.nextInt();
		
			if(PIN == pin) {
				break;
			}
			else {
				System.out.println("PIN이 잘못되었습니다.");
			}
		}while(true);
	}
	
	public void depasit() {
		System.out.print("입금액 : ");
		int depasit_money = sc.nextInt();
		balance += depasit_money;
	}
	public void withdraw() {
		System.out.print("인출액 : ");
		int withdraw_money = sc.nextInt();
		balance -= withdraw_money;		
	}
		
	public void transfer(Account otherAccount, int trans) {
		this.balance -= trans;
		otherAccount.balance += trans;
		System.out.println("현재 잔액은 "+this.balance+"입니다.");
		System.out.println(otherAccount.name+"님의 현재 잔액은"+otherAccount.balance+"입니다.");
		
	}
}

public class ATM {
	private static final byte DEPASIT = 1;
	private static final byte WITHDRAW = 2;
	private static final byte TRANSFER = 3;
	private static final byte QUIT = 4;
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int selector;
		
		Account MyAccount = new Account();
		Account Account1 = new Account("11011");
		Account Account2 = new Account("11012");
		Account Account3 = new Account("11013");
		
		MyAccount.PIN_in();
		
		do {
			System.out.println("1. 현금 입금");
			System.out.println("2. 현금 인출");
			System.out.println("3. 계좌 이체");
			System.out.println("4. 종료");
			System.out.println(" ");
			System.out.print("번호를 선택하세요 : ");
			selector = s.nextByte();
			
			switch(selector){
				case DEPASIT:
					MyAccount.depasit();
					System.out.println("현재 잔액은 "+MyAccount.balance+"입니다.");
					break;
				case WITHDRAW:
					MyAccount.withdraw();
					System.out.println("현재 잔액은"+MyAccount.balance+"입니다.");
					break;
				case TRANSFER:					
					System.out.print("이체액 : ");
					int transfer_money = s.nextInt();
					do {
						System.out.print("이체 계좌 번호 : ");
						String other_Account = s.next();
					
						if(other_Account.equals(Account1.name)) {
							MyAccount.transfer(Account1, transfer_money);
							break;
						}
						else if(other_Account.equals(Account2.name)) {
							MyAccount.transfer(Account2, transfer_money);
							break;
						}
						else if(other_Account.equals(Account3.name)) {
							MyAccount.transfer(Account3, transfer_money);
							break;
						}
						else {
							System.out.println("없는 계좌입니다.");
						}
					}while(true);										
				case QUIT:
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하여 주십시오.");
			}
			
		}while(selector != QUIT);
		System.out.println("이용해주셔서 감사합니다.");
	}

}
