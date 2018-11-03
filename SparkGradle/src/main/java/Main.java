import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World wassup");

        get("/", (req, res) -> "Main page, I guess?");
    }
}
