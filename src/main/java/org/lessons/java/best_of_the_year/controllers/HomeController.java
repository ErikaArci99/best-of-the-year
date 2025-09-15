package org.lessons.java.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // rotta
    public String home(Model model) {
        // passo il mio nome come attributo al model
        model.addAttribute("name", "Erika");
        // indico che deve caricare la view "index.html"
        return "index";
    }

}
