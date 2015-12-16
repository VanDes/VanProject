
public class Fish extends Pet {
	int currentDepth = 0;
	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
		System.out.println("Dive on deep" + howDeep + "foot's");
		System.out.println("I am on Depth" + currentDepth + "foot's on down sea");
		return currentDepth;
	}
	public String say(String something) {
		return "Fish doesn't say?";
	}
}
