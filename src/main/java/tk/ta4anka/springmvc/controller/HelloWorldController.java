package tk.ta4anka.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    //a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //a new controller method to read form data and add data to the model

    @RequestMapping("/processFormVersion2")
    public String addDataToModel(HttpServletRequest request, Model model){   // 'javax.servlet-api' have  to be added to pom.xml

        // read the request parameter from the HTML form
        String theUserName = request.getParameter("userName");

        // convert the data
        theUserName = theUserName.toUpperCase();

        // create the message
        String result = "Hi! " + theUserName;

        // add message to the model
        model.addAttribute("myMessage", result);
        return "helloworld";
    }

    //a new version of the previous method  by using @RequestParam
    @RequestMapping("/processFormVersion3")
    public String addDataToModelVersionThree(@RequestParam("userName") String theUserName, Model model){



        // convert the data
        theUserName = theUserName.toUpperCase();

        // create the message
        String result = "Hi! " + theUserName + " it's new version of form";

        // add message to the model
        model.addAttribute("myMessage", result);
        return "helloworld";
    }
}
