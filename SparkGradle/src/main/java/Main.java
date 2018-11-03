import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World wassup");

        get("/", (req, res) -> {
           return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
