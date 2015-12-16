public class Car {
		public void start() {
			System.out.println("Yeah we go on!");
		}
		public void stop() {
			System.out.println("Fuck, were are stuck this gluee!!!");
		}
		public int drive(int howlong) {
			int distance = howlong * 60;
			return distance;
		}
}
