package com.example.formwork.controller;

import com.example.formwork.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

        /*
        Person[] people = new Person[3];
        for (Person person : people) {
            person = new Person();
            person.setTitleList();
        }
        model.addAttribute("people", people);
        */

        return "index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String res(@ModelAttribute Person person) {
        
        return "results";
    }
}
