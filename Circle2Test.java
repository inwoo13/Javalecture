package sevenweek;

import java.util.*;

class Circle2{
	int radius;
	
	public Circle2(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle2 [radius=" + radius + "]";
	}	
}

public class Circle2Test {

	public static void main(String[] args) {
		Circle2[] list2 = new Circle2[3];
		for(int i=0; i<3; i++) {
			list2[i] = new Circle2((int)(Math.random()*100)+1);
		}
		for(int j=0; j<3; j++) {
			System.out.println(list2[j]);
		}
	}

}
