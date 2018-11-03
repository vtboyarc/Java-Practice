import static spark.Spark.*;

public class Main {
	public static void main(String[] args) {
		get("/hello", (req, res) -> "Hello World! I made this with Java, using the Spark Framework!");
		get("/savage", (req, res) -> "Mark is a savage");
	}
}