package com.example.formwork.controller;

import com.example.formwork.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        Person fred = new Person();
        fred.setTitleList();
        model.addAttribute("person", fred);
        return "index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String res(@RequestParam(value="first") String firstName,
                      @RequestParam(value="last") String lastName,
                      @RequestParam(value="kids") int numKids,
                      @RequestParam(value="title") String title,
                      Model resModel) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setNumKids(numKids);
        person.setTitle(title);
        resModel.addAttribute("person", person);
        return "results";
    }
}
