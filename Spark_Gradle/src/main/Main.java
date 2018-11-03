import static spark.Spark.*;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main {
    public static void main(String[] args) {
    	//http://localhost:4567/hello will give you this message
        get("/hello", (req, res) -> "Hello World");
        
        //http://localhost:4567 will give you this message
        get("/", (req, res) -> { 
        	return new ModelAndView(null, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}