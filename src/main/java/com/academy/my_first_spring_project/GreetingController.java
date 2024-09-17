package com.academy.my_first_spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "cssFileName" ,required = false,defaultValue = "") String cssString,
            @RequestParam(name ="n",required = false,defaultValue = "Welt") String someName,
            Model model
    ) {

        model.addAttribute("inputName",someName);
        model.addAttribute("cssFileName",cssString);
        return "greeting";
    }
    @GetMapping("/person")
    @ResponseBody
    public Person personJson() {


        Person person = Person.builder()
                .id(1L)
                .name("Paul")
                .build();
        return person;
    }
}
