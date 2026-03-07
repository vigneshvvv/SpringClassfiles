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



@GetMapping(@"/regTesting")

public UserDetails reqTesting(@Valid @Min(1) @Max(100) @RequestParam int id){

Optional<UserDetails> result = userService.getByIDExample(id);

if (result.isPresent()){

}

return result.get();

}

return null;}

@GetMapping("/getByUserName")

public UserDetails getByUserName(@Valid @Size(min 1, max 100, message "the size is not valid") @RequestParam String userName) {

Optional<UserDetails> result = userService.getByUserName (userName);

if (result.isPresent()){

return result.get();

}

return null;}

@GetMapping("/getByAge"

public List<UserDetails> getByAge(@Valid @Min(1) @Max(108) @RequestParam int age)
                                              {


return userService.getBYAge(age);}

@GetMapping("/getUsersObject")

public Users getUserObject(){

return userService.getUser();

}
