package io.adamcarter.giflib.web.controller;


import io.adamcarter.giflib.model.Category;
import io.adamcarter.giflib.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    // Index of all categories
    @SuppressWarnings("unchecked")
    @RequestMapping("/categories")
    public String listCategories(Model model) {
        List<Category> categories = categoryService.findAll();

        model.addAttribute("categories", categories);
        return "category/index";
    }

    // Single category page
    @RequestMapping("/categories/{categoryId}")
    public String category(@PathVariable Long categoryId, Model model) {
        Category category = null;

        model.addAttribute("category",category);

        return "category/details";
    }
}
