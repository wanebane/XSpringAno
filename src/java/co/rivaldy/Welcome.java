/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rivaldy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/page")
public class Welcome {

    @RequestMapping()
    public String myPage(Model model) {
        model.addAttribute("message", "Welcome to MyPage");
        return "page";
    }
    @RequestMapping("/drink")
    public String drink(Model model){
        model.addAttribute("message","Cappucino with ice");
        return "page";
    }
}
