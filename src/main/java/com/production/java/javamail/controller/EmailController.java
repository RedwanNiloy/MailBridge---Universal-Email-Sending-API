package com.production.java.javamail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.production.java.javamail.entity.EmailEntity;
import com.production.java.javamail.service.EmailService;


@RestController
@RequestMapping("/javamail")
public class EmailController{


@Autowired
private EmailService es;



@GetMapping("/sendmail")
public String sendM(@RequestParam String to,@RequestParam String sub,@RequestParam String body){

    es.sendEmail(to, sub, body);
return "Email Sent Succesfully";

}

@PostMapping("/sendmail")
public String sendM(@RequestBody EmailEntity e ){

es.sendEmail(e.getTo(), e.getSubject(), e.getBody());
return "Email Sent Succesfully";

}

}