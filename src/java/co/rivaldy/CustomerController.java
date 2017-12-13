package co.rivaldy;

import co.rivaldy.dao.CustomerService;
import co.rivaldy.model.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService cs;
    
    @RequestMapping(value = "/all")
    public String showAllCustomers(Model model) {
        List<Customer> customers = cs.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }
    @RequestMapping(value = "/{customerId}")
    public String showOneCustomer(@PathVariable Integer customerId, Model model){
        Customer customer = cs.findById(customerId);
        model.addAttribute("customers", customer);
        return "customerdetail";
    }
//    
//    @RequestMapping(value = "/helloWorld/id")
//    public String helloWorld(){
//        return "redirect:/indo/info";
//    }
//    
//    @RequestMapping(value = "/(indocyberId)")
//    public String
}
