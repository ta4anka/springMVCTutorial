package tk.ta4anka.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.ta4anka.springmvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //create a student object
        Student theStudent = new Student();

        //add student object to the model
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }
}
