package dk.kea.sessionbakery.controller;

import dk.kea.sessionbakery.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BakeryController {

        ProductRepository repo = new ProductRepository();

        @GetMapping("/")
        public String index(HttpSession session){
            return "index";
        }

        @GetMapping("/basket")
        public String basket(HttpSession session){
            return "basket";
        }

        @GetMapping("/shop")
        public String basket(HttpSession session, Model cookieModel){
            cookieModel.addAttribute("products",repo.getAllProducts());
            return "shop";
        }

        @GetMapping("/addToBasket")
        public String add(@RequestParam String id){
            return "";
        }

}
