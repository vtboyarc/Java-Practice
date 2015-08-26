
/*
 * polymprhism: if you have a child class, of a parent class, you can always use
 * the child class, anywhere you would normally use the parent class
 */

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		//makes plant2 reference plant1, same object, only 1 actual object
		//Plant plant2 = plant1;
		//Tree is a child class of Plant, so can do this...this polymporhpism
		Plant plant2 = tree;
		//will use the grow method in the Tree class, since plant2 is pointing at a Tree object
		//so plant2 is a Tree, essentially 
		//Note: Need to have a method with same name in Plant class,
		// it will just do what is inside the method name in the Tree class
		plant2.grow();
		
		tree.shedLeaves();
		//so this won't work, since no method named shedLeaves in Plant class
		//plant2.shedLeaves();
		
		//will say tree growing, since Plant is child of Tree
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
