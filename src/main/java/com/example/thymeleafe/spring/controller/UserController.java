package com.example.thymeleafe.spring.controller;

import com.example.thymeleafe.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle varible-expression request

    @GetMapping("varible-expression")
    public String varibelexpression(Model model){
        User user = new User("sandushi","sandu@gmail.com", "admin","female");
        model.addAttribute("user", user);
        return "varible-expression";
    }

    //handler method to handle selection expression

    @GetMapping("selection-expression")
    public String selectionexoression(Model model){
        User user = new User("sandushi","sandu@gmail.com", "admin","female");
        model.addAttribute("userselection", user);
        return "selection-expression";

    }

    //handler method to handle message expression request

    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    //handle method to handle link expression

    @GetMapping("link-expression")
    public String LinkExpression(Model model){
        model.addAttribute("id",1);
        return "link-expression";
    }

    //handler method to handle fragment expression request

    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("admin","admin@gmil.com","admin", "male");
        User ramesh = new User("ramesh","ramesh@gamil.com","user", "male");
        User meena = new User("meena","meena@gmail.com","user","female");
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(meena);
        model.addAttribute("users",users);
        return "users";


    }
}
