package eregistrarmgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentsController {
    @GetMapping( "/eregistrar/students")
    public String displayHomePage(){
        return "Home/students";
    }
}
