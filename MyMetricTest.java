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
		System.out.println(kilo+"km를 마일로 바꾸면 "+ a); 
	}
	
	public static void mileToKillo() {
		a = mile*1.6093;
		System.out.println(mile+"mile을 km로 바꾸면 "+ a);
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
