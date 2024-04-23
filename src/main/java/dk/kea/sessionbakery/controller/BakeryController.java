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
        public String basket(HttpSession session, Model model){
            //Hent products fra basket
            //tæl prisen på produkterne sammen
            //tilføj prisen til model og opdater basket.html så prisen vises
            return "basket";
        }

        @GetMapping("/shop")
        public String shop(HttpSession session, Model sessionModel){
            sessionModel.addAttribute("products",repo.getAllProducts());
            return "shop";
        }

        @GetMapping("/addToBasket")
        public String add(@RequestParam String id, HttpSession httpSession){
            //create og add product til basket - gem i Session
            return "redirect:/basket";
        }

}
