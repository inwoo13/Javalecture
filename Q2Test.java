package sixweek;

import java.util.*;

class Q2{
	int num;
	int[] seats = {0,1,2,3,4,5,6,7,8,9};
	int[] reserve_seats = new int [10];
	
	Scanner sc = new Scanner(System.in);
	
	public void print() {
		for(int i=0; i<30; i++) {
			System.out.print("-");
		}
		
		System.out.println(" ");
		
		for(int j=0; j<seats.length; j++) {
			System.out.print(seats[j]+" ");
		}
		
		System.out.println(" ");
		
		for(int k=0; k<30; k++) {
			System.out.print("-");
		}
		
		System.out.println(" ");
		
		for(int j=0; j<reserve_seats.length; j++) {
			System.out.print(reserve_seats[j]+" ");
		}
		
		System.out.println(" ");
		
		for(int k=0; k<30; k++) {
			System.out.print("-");
		}
		
		System.out.println(" ");
		
	}

	public void reserve() {
		
		do {
		System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? "+"\n");
		num = sc.nextInt();	
		
		if(0>num || num>9 ) {
			System.out.println("���� �¼��Դϴ�.");
		}
		
		else {		break;}
		
		}while(-1 < num || num < 10);
		System.out.println("����Ǿ����ϴ�.");				
		
		reserve_seats[num] = 1;
		
	}
	
	
}


public class Q2Test {
	public static void main(String[] args) {
		Q2 seat1 = new Q2();
		
		seat1.print();
		seat1.reserve();
		seat1.print();

		}

	}

