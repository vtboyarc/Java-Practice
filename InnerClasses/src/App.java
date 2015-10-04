
public class App {
	public static void main(String[] args) {

		Robot robot1 = new Robot(7);
		robot1.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
