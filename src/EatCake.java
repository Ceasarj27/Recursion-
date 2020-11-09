
public class EatCake {

	public EatCake() {
		
	}
	
	public static void EatCake(Cake cake) {
		if(!cake.isEmpty()) {
			cake.takeABite();
			EatCake(cake);
		}
	}

	public static void main(String[] args) {
		Cake cake = new Cake();
		EatCake(cake);
		System.out.println("Done eating cake " + " - ready to go back to Java 2!");
	}


}
