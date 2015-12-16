public class CarOwner {
	public static void main(String[] args) {
		int way;
		Car myCar = new Car();
		myCar.start();
		way = myCar.drive(5);
		System.out.println(way);
		myCar.stop();
	}

}
