package tk.ta4anka.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

//    a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
