package sixweek;

class MyMetric{
	static double kilo;
	static double mile;
	static double a;

	public static double getKilo() {
		return kilo;
	}

	public static void setKilo(double kilo) {
		MyMetric.kilo = kilo;
	}

	public static double getMile() {
		return mile;
	}

	public static void setMile(double mile) {
		MyMetric.mile = mile;
	}

	public static void kiloToMile() {
		a = kilo/1.6093;
		System.out.println(kilo+"km�� ���Ϸ� �ٲٸ� "+ a); 
	}
	
	public static void mileToKillo() {
		a = mile*1.6093;
		System.out.println(mile+"mile�� km�� �ٲٸ� "+ a);
	}
}

public class MyMetricTest {

	public static void main(String[] args) {
		MyMetric metric = new MyMetric();
		
		metric.setKilo(1);
		metric.kiloToMile();
		
		metric.setMile(0.621388181196);
		metric.mileToKillo();
		

	}

}
