package co.rivaldy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {

    @RequestMapping()
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping(value="/save")
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model){
        System.out.println("User Firstname : "+registerBean.getFirstName());
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
}
