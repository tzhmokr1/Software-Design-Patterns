import com.sun.prism.paint.Color;

public class Birke implements Tree {
	
	private Color color;
	private TreeType treeType;
	
	public Birke() {
		this.color = Color.BLACK;
		this.treeType = treeType.BIRKE;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public TreeType getTreeType() {
		return treeType;
	}

	@Override
	public void drawTree(int x, int y, int height) {
		//Zeichne die Birke mithilfe der extrinsischen Daten (Kontext)
		System.out.println("Birke wurde an Position (" + x + "/" + y + ") mit einer Höhe von " + height + " gezeichnet!");
	}
	
	
}
