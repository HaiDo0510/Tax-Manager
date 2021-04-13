package org.o7planning.controller;

import org.o7planning.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private IUserService userService;

    @RequestMapping({"/","index"})
    public String home(){
        return "index";
    }

    @RequestMapping("index-admin")
    public String indexAdmin(){
        return "admin/index-admin";
    }
    @RequestMapping("/test")
    public String index(){
        return "test";
    }
    @RequestMapping("/home")
    public String home1(){
        return "home";
    }
    @RequestMapping("/search-calculator")
    public String search_calculator(){
        return "search-calculator";
    }
    @RequestMapping("/search-info")
    public String search_info(){
        return "search-info";
    }
    @RequestMapping("/new")
    public String news(){
        return "new";
    }
    @RequestMapping("/question")
    public String question(){
        return "question";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/list-taxpayer")
    public String listTaxPayer(){
        return "admin/list-taxpayer";
    }
    @RequestMapping("/organizations-taxpayer")
    public String organizationsTaxpayer(){
        return "admin/organizations-taxpayer";
    }
    @RequestMapping("/report")
    public String report(){
        return "admin/report";
    }
    @RequestMapping("/configuration")
    public String configuration(){
        return "admin/configuration";
    }


    @PostMapping("/loginuser")
    public String checkUser(@ModelAttribute("email") String email, @ModelAttribute("password") String password, Model model){
        Boolean temp = userService.checkUser(email, password);
        if(temp){
            return "redirect:index-admin";
        } else{
            model.addAttribute("mess","Đăng nhập thất bại");
            return "test";
        }
    }

}
