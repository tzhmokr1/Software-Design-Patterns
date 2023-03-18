
public class Demo {

	public static void main(String[] args) {
		Shape greenRectangle = new Rectangle(new GreenRectangle(), 2, 2, 10, 5);
		greenRectangle.draw();
		
		Shape yellowRectangle = new Rectangle(new YellowRectangle(), 3, 3, 20, 10);
		yellowRectangle.draw();
		
		
	}

}
