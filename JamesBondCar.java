
public class JamesBondCar extends Car {
	public int drive(int howlong) {
		int distance = howlong * 180;
		return distance;
	}
	public static void main(String[] args) {
		int way;
		Car myJBCar = new Car();
		myJBCar.start();
		way = myJBCar.drive(3);
		System.out.println(way);
		myJBCar.stop();
	}
}