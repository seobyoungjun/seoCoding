import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.add(7);
		System.out.println(tree.first());
		System.out.println(tree.last());
	}
}
