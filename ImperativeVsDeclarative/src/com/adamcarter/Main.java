package com.adamcarter;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList(
                "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );

        // this is declarative programming - which is used in functional programming
        // it is more descriptive, verbose
//        boolean hasEggs = false;
//        for (String ingredient : ingredients) {
//            if (ingredient.equals("eggs")) {
//                hasEggs = true;
//                break;
//            }
//        }

//        if (hasEggs) {
//            System.out.println("Sorry, it has eggs");
//        }

        // imperative programming, we can skip the above code and get same results, like so:
        if (ingredients.contains("eggs")) {
            System.out.println("Sorry, it has eggs");
        }


        // succinct way of printing each ingredient using a lambda
        ingredients.forEach(ingredient -> System.out.println(ingredient));
    }
}
