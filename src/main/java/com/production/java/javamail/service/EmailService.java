package  com.production.java.javamail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService{


@Autowired
private JavaMailSender javamail;


public void sendEmail(String to, String subject, String body)
{

 try {
    SimpleMailMessage mail = new SimpleMailMessage();
    mail.setTo(to);
    mail.setSubject(subject);
    mail.setText(body);
    javamail.send(mail);

     
 } catch (Exception e) {
    System.out.println("The errror is "+e);
 }



}







}