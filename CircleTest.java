package sevenweek;

class Circle{
	static int x, y;
	static int radius;

	public Circle() {
		this.x = 0;
		this.y = 0;
		radius =5;
	}
	
	public Circle(int x, int y, int radius){
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	static void move(int i, int j) {
		x += i;
		y += j;		
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}	
}

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(10, 10, 5);
		System.out.println(c+ "\n");
		System.out.println("move() 호출 전");
		System.out.println(c);
		c.move(10,20);
		System.out.println("move() 호출 후");
		System.out.println(c);

	}

}
