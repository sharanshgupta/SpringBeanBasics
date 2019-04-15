package spring.firstproject.spring5tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.firstproject.spring5tutorial.mail.MailSender;
import spring.firstproject.spring5tutorial.mail.MockMailSender;



@RestController
public class MailController {
	
	//@Autowired
	//private MailSender sender;
	
	@Autowired
	private MailSender mail;

	@RequestMapping("/mail")
	public String mail() {
		
		mail.send("sharanshgupta@hotmail.com", "Test mail", "Body of the mail");
		//sender.send("sharanshgupta@hotmail.com", "Test Spring Dependency Injection", "Im the Primary");
		
		return "Mail Sent!";
		
	}
	
}
