package com.cydeo.spring05thymeleaf.service.impl;

import com.cydeo.spring05thymeleaf.model.Cart;
import com.cydeo.spring05thymeleaf.model.CartItem;
import com.cydeo.spring05thymeleaf.model.Product;
import com.cydeo.spring05thymeleaf.service.CartService;
import com.cydeo.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {
    public static Cart CART = new Cart(BigDecimal.ZERO,new ArrayList<>());

    private final ProductService productService;

    public CartServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Cart addToCart(UUID productId, Integer quantity){

        Product product = productService.findProductById(productId);

        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalAmount(product.getPrice().multiply(BigDecimal.valueOf(quantity)));
        //totalAmount = productPrice * Quantity
        //I need to add product and quantity to carItem
        //set cartItem totalAmount

        //add cartItem to cart
        CART.getCartItemList().add(cartItem);
        //update CART totalAmount
        CART.setCartTotalAmount(CART.getCartTotalAmount().add(cartItem.getTotalAmount()));
        return CART;
    }

    @Override
    public boolean deleteFromCart(UUID productId){

        //I need to find CartItem to delete based on product ID
        CartItem itemToDelete = CART.getCartItemList().stream()
                .filter(c -> c.getProduct().getId().equals(productId))
                .findAny().orElseThrow();

        //total cart amount needs to be updated with subtracting the itemToDelete amount
        CART.setCartTotalAmount(CART.getCartTotalAmount().subtract(itemToDelete.getTotalAmount()));

        //remove itemToDelete from the list<cartItem>
        return CART.getCartItemList().remove(itemToDelete);
    }
}
