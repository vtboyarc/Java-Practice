package io.adamcarter.giflib.web.controller;


import io.adamcarter.giflib.model.Category;
import io.adamcarter.giflib.service.CategoryService;
import io.adamcarter.giflib.web.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    // Form for adding a new category
    @RequestMapping("categories/add")
    public String formNewCategory(Model model) {
        model.addAttribute("category", new Category());
        model.addAttribute("colors", Color.values());

        return "category/form";
    }


    // Single category page
    @RequestMapping("/categories/{categoryId}")
    public String category(@PathVariable Long categoryId, Model model) {
        Category category = null;

        model.addAttribute("category",category);

        return "category/details";
    }

    // Add a category
    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public String addCategory(Category category) {
        categoryService.save(category);

        return "redirect:/categories";
    }

    // Delete an existing category
    @RequestMapping(value = "/categories/{categoryId}/delete", method = RequestMethod.DELETE)
    public String deleteCategory(@PathVariable Long categoryId) {

        return null;
    }
}
