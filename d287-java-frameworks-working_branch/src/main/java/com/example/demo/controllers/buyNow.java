package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.bootstrap.BootStrapData;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.repositories.ProductRepository;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Product;

import java.util.Optional;


@Controller
public class buyNow {
@Autowired
    private ProductRepository productRepository;
    @GetMapping("/buyNow")
    public String purchaseNow(@RequestParam("productID")int productID) {
        Optional<Product> product = productRepository.findById((long) productID);
        if (product.isPresent()){
            Product val = product.get();
            if (val.getInv() > 0){
                val.setInv(val.getInv() - 1);
                productRepository.save(val);
                return "buyNow";
            }
            else{
                return "/error";
            }
        }
        else {
            return "/error";
        }
    }
}
