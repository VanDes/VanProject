
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep() {
		System.out.println("Good night! Goodbye");
	}
	
	public void eat() {
		System.out.println("I am hungry, maybe eat chpis?");
	}
	
	public String say(String aWord) {
		String petResponse = "Ok"+ aWord;
		return petResponse;
	}
}
