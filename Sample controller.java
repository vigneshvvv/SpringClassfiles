package com.sample.demo.controller;

import com.sample.demo.model.UserDetails;

import com.sample.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

RestController

@RequestMapping("/api/v1")

public class SampleController (

Autowired

UserService userService;

@GetMapping(@"/home")

putilic UserDetails homellethod(@RequestParas String producthane, @RequestParan int price){

System.out.println(price);

}

//tightly coupled to overcome this we are using autowire UserService user = new UserService();

return userService.getUserDetailsSample();
}}

public String contact() { return "The contact is working fine";}

@GetMapping("/contact")

@PostMapping("/home")

public UserDetails postMethod(@RequestBody UserDetails userDetails)

return userDetails;
