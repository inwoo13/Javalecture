package sevenweek;

class Car{
	String model;
	String maker;
	static int numberOfCars;
	
	public Car(String model, String maker) {
		this.model = model;
		this.maker = maker;
		numberOfCars ++;
		System.out.println("자동차 1대 생산, 누적 생산량= "+numberOfCars+"대");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}
	
	static int getNumberOfCar() {
		return numberOfCars;
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		Car a = new Car("abc", "samsung");
		Car b = new Car("ac", "sung");
		Car c = new Car("bc", "samg");
		Car d = new Car("c", "sag");

		
	}
}
