public class App {
	public static void main(String[] args) {
		
		//one dimension array
		int[] values = {3, 5, 2343};
		
		System.out.println(values[2]);
		
		//multi-dimensional, each element in the array, is another array
		int[][] grid = {
				{3, 5, 2343}, //row 0
				{2, 4}, //row 1
				{1,2,3,4} //row 2
		};
		//so row 1, index 1
		System.out.println(grid[1][1]);
		//row 0, index 2
		System.out.println(grid[0][2]);
		
		//2 dimensional array of Strings
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col< grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		//you can keep last one empty, just sets it to null
		String[][] words = new String[2][];
		
		System.out.println(words[0]);
	}
}
