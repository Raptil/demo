package com.example.onlineShop.service;


import com.example.onlineShop.domain.dto.BasketDTO;
import com.example.onlineShop.domain.dto.ProductDTO;
import com.example.onlineShop.domain.dto.UserDTO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasketServiceTest {

    @Autowired
    BasketService basketService;

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;


    @Ignore
    @Test
    public void createBasket() {


        UserDTO user = userService.getUser(5);

        BasketDTO basketDTO = new BasketDTO();
        basketService.addBasket(basketDTO, user);

    }


    @Test
    public void addProduct() {

        basketService.addProductToBasket(productService.getProduct("pen"), 4);
    }


}
