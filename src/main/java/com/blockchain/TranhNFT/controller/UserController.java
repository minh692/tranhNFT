package com.blockchain.TranhNFT.controller;

import com.blockchain.TranhNFT.dto.request.UserRequestDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")

public class UserController {
    @PostMapping
    public String addUser(@RequestBody UserRequestDTO userRequestDTO){
        System.out.println("Request add user " + userDTO.getFirstName());

    }
}
