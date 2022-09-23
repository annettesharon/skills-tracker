package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsList() {
        String html =
                "<html>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol>" +
                        "<li> Java </li>" +
                        "<li> JavaScript </li>" +
                        "<li> Python </li>" +
                        "</ol>" +
//                        "<body>" +
//                        "<form method = 'get' action = '/hello'>" +
//                        "<input type = 'text' name = 'coder' />" +
//                        "<input type = 'submit' value = 'Greet Me!' />" +
//                        "</form>" +
//                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @PostMapping
    public String form(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'form'>" +
                        "<label for=\"name\">Name:</label><br>" +
                        "<input type=\"text\" id=\"name\" name=\"name\"><br>" +
                        "<label for=\"languageOne\">My favorite language:</label><br>" +
                        "<select name=\"languageOne\">\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"JavaScript\">JavaScript</option>\n" +
                        "  <option value=\"Python\">Python</option>" +
                        "</select><br>" +
                        "<label for=\"languageTwo\">My second favorite language:</label><br>" +
                        "<select name=\"languageTwo\">\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"JavaScript\">JavaScript</option>\n" +
                        "  <option value=\"Python\">Python</option>" +
                        "</select><br>" +
                        "<label for=\"languageThree\">My third favorite language:</label><br>" +
                        "<select name=\"languageThree\">\n" +
                        "  <option value=\"Java\">Java</option>\n" +
                        "  <option value=\"JavaScript\">JavaScript</option>\n" +
                        "  <option value=\"Python\">Python</option>" +
                        "</select><br>" +
                        "<button type = 'submit'> Submit! </button>"+
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    public String skillsTrackerSuccess(@RequestParam String name, String languageOne, String languageTwo, String languageThree) {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li>" + languageOne + "</li>" +
                        "<li>" + languageTwo + "</li>" +
                        "<li>" + languageThree + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
