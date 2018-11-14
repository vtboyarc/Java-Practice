package io.adamcarter.giflib.web.controller;

import io.adamcarter.giflib.data.GifRepository;
import io.adamcarter.giflib.model.Gif;
import io.adamcarter.giflib.service.CategoryService;
import io.adamcarter.giflib.service.GifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class GifController {
    @Autowired
    private GifService gifService;

    @Autowired
    private CategoryService categoryService;

    // Home page - index of all GIFs
    @RequestMapping("/")
    public String listGifs(Model model) {
        // TODO: Get all gifs
        List<Gif> gifs = gifService.findAll();

        model.addAttribute("gifs", gifs);
        return "gif/index";
    }

    // Single GIF page
    @RequestMapping("/gifs/{gifId}")
    public String gifDetails(@PathVariable Long gifId, Model model) {
        // TODO: Get gif whose id is gifId
        Gif gif = gifService.findById(gifId);

        model.addAttribute("gif", gif);
        return "gif/details";
    }
}