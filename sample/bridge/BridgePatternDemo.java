package bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Cirlce(new RedCircle(), 100, 100, 10);
		Shape greenCircle = new Cirlce(new GreenCircle(), 100, 100, 10);
		
		redCircle.draw();
		greenCircle.draw();
	}

}
