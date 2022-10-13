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
			System.out.print("PIN�� �Է��Ͻÿ� : ");
			int PIN = sc.nextInt();
		
			if(PIN == pin) {
				break;
			}
			else {
				System.out.println("PIN�� �߸��Ǿ����ϴ�.");
			}
		}while(true);
	}
	
	public void depasit() {
		System.out.print("�Աݾ� : ");
		int depasit_money = sc.nextInt();
		balance += depasit_money;
	}
	public void withdraw() {
		System.out.print("����� : ");
		int withdraw_money = sc.nextInt();
		balance -= withdraw_money;		
	}
		
	public void transfer(Account otherAccount, int trans) {
		this.balance -= trans;
		otherAccount.balance += trans;
		System.out.println("���� �ܾ��� "+this.balance+"�Դϴ�.");
		System.out.println(otherAccount.name+"���� ���� �ܾ���"+otherAccount.balance+"�Դϴ�.");
		
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
			System.out.println("1. ���� �Ա�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ��ü");
			System.out.println("4. ����");
			System.out.println(" ");
			System.out.print("��ȣ�� �����ϼ��� : ");
			selector = s.nextByte();
			
			switch(selector){
				case DEPASIT:
					MyAccount.depasit();
					System.out.println("���� �ܾ��� "+MyAccount.balance+"�Դϴ�.");
					break;
				case WITHDRAW:
					MyAccount.withdraw();
					System.out.println("���� �ܾ���"+MyAccount.balance+"�Դϴ�.");
					break;
				case TRANSFER:					
					System.out.print("��ü�� : ");
					int transfer_money = s.nextInt();
					do {
						System.out.print("��ü ���� ��ȣ : ");
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
							System.out.println("���� �����Դϴ�.");
						}
					}while(true);										
				case QUIT:
					break;
				default:
					System.out.println("�߸��� �����Դϴ�. �ٽ� �����Ͽ� �ֽʽÿ�.");
			}
			
		}while(selector != QUIT);
		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
