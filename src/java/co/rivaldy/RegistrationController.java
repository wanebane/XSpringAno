package co.rivaldy;

import co.rivaldy.dao.UserService;
import co.rivaldy.model.User;
import co.rivaldy.utils.PasswordDigest;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserService us;

    @RequestMapping()
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }

    @RequestMapping(value = "/save")
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model) {
        User user = new User();
        String encryptedPassword = PasswordDigest.createEncryptedPassword(registerBean.getPassword());
        user.setFirstName(registerBean.getFirstName());
        user.setLastName(registerBean.getLastName());
        user.setUsername(registerBean.getUsername());
        user.setPassword(encryptedPassword);
        us.saveUser(user);
//        System.out.println("User Firstname : "+registerBean.getFirstName());
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
}
