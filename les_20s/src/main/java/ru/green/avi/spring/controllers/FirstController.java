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

        try {
            int a = Integer.parseInt(request.getParameter("a"));
            int b = Integer.parseInt(request.getParameter("b"));
            String action = request.getParameter("action");
            double result;

            switch (action) {
                case "multiplication":
                    result = a * b;
                    break;
                case "addition":
                    result = a + b;
                    break;
                case "subtraction":
                    result = a - b;
                    break;
                case "division":
                    result = a / (double) b;
                    break;
                default:
                    throw new RuntimeException();
            }
            model.addAttribute("response", result);

        } catch (RuntimeException e) {
            model.addAttribute("response", "Please, enter valid input data");
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
