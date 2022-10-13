package sevenweek;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts{
	String name;
	String tel;
	String email;
	static int count;
	
	public Contacts(String name, String tel, String emmail){
		this.name = name;
		this.tel = tel;
		this.email = email;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

public class ContactsTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Contacts> list = new ArrayList<>();
		System.out.println("����ó�� �Է��Ͻÿ�.(���� -1)");
		while(true){	
			System.out.print("�̸��� ��ȭ��ȣ, �̸����� �Է��Ͻÿ�: ");
			String name = s.next();
			if(name.equals("-1")) break;
			String tel = s.next();
			String email = s.next();
			list.add(new Contacts(name, tel, email));
		}
		System.out.println("���ε��� ����"+Contacts.count+"�Դϴ�.");
		String n1 = s.nextLine();
		System.out.print("�˻��� �̸��� �Է��Ͻÿ�: ");
		String n2 = s.nextLine();
		for(Contacts c : list) {
			if(c.getName().equals(n2))
				System.out.println(c.getTel());
		}
	}
}
