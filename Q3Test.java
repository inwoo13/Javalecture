package sixweek;

import java.util.*;

class Q3{
	int grade1;
	int grade2;
	int grade3;
	int grade4;
	int grade5;
	int total;
	double avg;
	
	Scanner sc = new Scanner(System.in);
	
	public void grade() {		
		System.out.print("A���� ����: ");
		grade1 = sc.nextInt();	
		System.out.print("B���� ����: ");
		grade2 = sc.nextInt();
		System.out.print("C���� ����: ");
		grade3 = sc.nextInt();
		System.out.print("D���� ����: ");
		grade4 = sc.nextInt();
		System.out.print("E���� ����: ");
		grade5 = sc.nextInt();		
	}
	
	public void getTotal() {
		total = grade1+grade2+grade3+grade4+grade5;
		System.out.println("�հ� : "+total);
	}
	
	public void getAverage() {
		avg = (grade1+grade2+grade3+grade4+grade5)/5;
		System.out.println("��� : "+avg);
	}
}

public class Q3Test {

	public static void main(String[] args) {
		Q3 totavg = new Q3();
		
		totavg.grade();
		System.out.println(" ");
		totavg.getTotal();
		totavg.getAverage();
		
		

	}

}
