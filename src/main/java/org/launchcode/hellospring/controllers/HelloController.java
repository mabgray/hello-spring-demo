package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /*@GetMapping("hello")// this is an endpoint
    @ResponseBody
    public String HelloSpring() {
        return "Hello Spring";
    }
*/


    @GetMapping("goodbye")
    @ResponseBody
    public String goodbyeSpring() {
        return "goodbye Spring";

    }
    @GetMapping("hello")
    @ResponseBody
    public String QuerieSpring(@RequestParam String coder ) {
         return "Hello, " + coder + "!";

    }
    @GetMapping("hello/{orbiter}")
    @ResponseBody
    public String pathSpring(@PathVariable String orbiter) {
        return "Hello, " + orbiter + "!";

    }
    @GetMapping
    @ResponseBody
    public String formSpring() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;

    }



}