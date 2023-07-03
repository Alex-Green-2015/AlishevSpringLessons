package ru.green.avi.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/calculator")
    public String helloPage(HttpServletRequest request,
                            Model model) {

        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String action = request.getParameter("action");

        try {
            double firstParam = Double.parseDouble(a);
            double secondParam = Double.parseDouble(b);
            double response;

            switch (action) {
                case "multiplication":
                    response = firstParam * secondParam;
                    model.addAttribute("response", Double.toString(response));
                    break;
                case "addition":
                    response = firstParam + secondParam;
                    model.addAttribute("response", Double.toString(response));
                    break;
                case "subtraction":
                    response = firstParam - secondParam;
                    model.addAttribute("response", Double.toString(response));
                    break;
                case "division":
                    response = firstParam / secondParam;
                    model.addAttribute("response", Double.toString(response));
                    break;
                default:
                    throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            String response = "Error. Input data is incorrect";
            model.addAttribute("response", response);
        }

        return "first/calculation";
    }

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
