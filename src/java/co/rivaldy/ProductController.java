/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.rivaldy;

import co.rivaldy.dao.ProductService;
import co.rivaldy.model.Product;
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
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService ps;
    @RequestMapping(value = "/all")
    public String showAllProducts(Model model){
        List<Product> products = ps.findAll();
        model.addAttribute("product", products);
        return "products";
    }
    @RequestMapping(value = "/{productId}")
    public String showOneProduct(@PathVariable Integer productId, Model model){
        Product product = ps.findById(productId);
        model.addAttribute("products", product);
        return "productdetail";
    }
}
