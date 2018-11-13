package io.adamcarter.giflib.web.controller;

import io.adamcarter.giflib.data.CategoryRepository;
import io.adamcarter.giflib.data.GifRepository;
import io.adamcarter.giflib.model.Category;
import io.adamcarter.giflib.model.Gif;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @SuppressWarnings("unchecked")
    @RequestMapping("/categories")
    public String listCategories(Model model) {
        Session session = sessionFactory.openSession();
        List<Category> categories = session.createCriteria(Category.class).list();

        model.addAttribute("categories", categories);
        return "category/index";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category";
    }
}
