
public class Demo {

	public static void main(String[] args) {
		
		Tree tree1 = TreeFactory.getTree(TreeType.TANNE);
		tree1.drawTree(10, 10, 30);
		
		Tree tree2 = TreeFactory.getTree(TreeType.TANNE);
		tree2.drawTree(5, 5, 20);
		
		Tree tree3 = TreeFactory.getTree(TreeType.BIRKE);
		tree3.drawTree(2, 2, 22);
		
		Tree tree4 = TreeFactory.getTree(TreeType.BIRKE);
		tree4.drawTree(3, 4, 23);
		
		Tree tree5 = TreeFactory.getTree(TreeType.TANNE);
		tree5.drawTree(17, 13, 38);


	}

}
