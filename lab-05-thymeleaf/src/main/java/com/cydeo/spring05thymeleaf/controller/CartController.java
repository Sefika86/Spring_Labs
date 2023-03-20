package com.cydeo.spring05thymeleaf.controller;

import com.cydeo.spring05thymeleaf.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

import static com.cydeo.spring05thymeleaf.service.impl.CartServiceImpl.CART;

@Controller
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/cart")
    public String getCart(Model model){

        model.addAttribute("cart", CART);  //you need to write it like CartServiceImpl.CART, or you need to import it statically to be able to write it

        return "cart/show-cart";
    }


    //write a method, that accepts 2 Path variables
    //addToCart/V1/V2
    //we will actually addToCart(next step)
    //which returns cart page

    @GetMapping("/addToCart/{productId}/{quantity}")
    public String addToCart(@PathVariable("productId")UUID productId,
                            @PathVariable("quantity") Integer quantity){

        cartService.addToCart(productId, quantity);

        return "redirect:/cart";
    }


    @GetMapping("/delete/{productId}")
    public String deleteItem(@PathVariable UUID productId){


       cartService.deleteFromCart(productId);

        return "redirect:/cart";
    }
}
