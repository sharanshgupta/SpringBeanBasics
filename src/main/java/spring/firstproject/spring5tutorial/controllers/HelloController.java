package spring.firstproject.spring5tutorial.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.firstproject.spring5tutorial.mail.SmtpMailSender;

@RestController
public class HelloController {

	private static Log log = LogFactory.getLog(SmtpMailSender.class);
	
	//@Value("${app.name}")
	//private String appName;
	
	@RequestMapping("/hello")
	public String hello() {
		log.info("Hello World called.");
		return "Hello World!";
	}
	
}
