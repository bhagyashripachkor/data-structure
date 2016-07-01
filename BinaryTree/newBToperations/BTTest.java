package tree;

public class BTTest {
	public static void main(String[] args){
		BT b = new BT();
		
		b.insert(6);
		b.insert(24);
		b.insert(19);
		b.insert(94);
		b.insert(10);
		b.insert(5);
		b.preorder();
		System.out.println("----------------");
		b.inorder();
		System.out.println("----------------");
		b.postorder();
		System.out.println();
		System.out.println(b.getsize());
		b.height();
		b.search(94);
		b.search(85);
	}
}
