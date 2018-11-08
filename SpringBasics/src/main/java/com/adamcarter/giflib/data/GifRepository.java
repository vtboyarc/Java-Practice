package com.adamcarter.giflib.data;

import com.adamcarter.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "adam", false),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "booger", true),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "bad luck brian", false),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public Gif findByName(String name) {
        // for every gif object in ALL_GIFS
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
