class Temp implements AutoCloseable {

	//got this by clicking on the error for AutoCloseable, and clicking
	// 'add unimplemented methods'
	@Override
	public void close() throws Exception {
		System.out.println("Closing");
		
	}
	
}

public class App {
	public static void main(String[] args) {

		//java 7 style of try/catch block, try with resources
		try(Temp temp = new Temp()) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
