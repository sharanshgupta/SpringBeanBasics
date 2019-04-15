package spring.firstproject.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class MockMailSender implements MailSender  {

	private static Log log = LogFactory.getLog(MockMailSender.class);
	 
	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		
		log.info("Sending MOCK mail to " + to);
		log.info(" with Subject -  " + subject);
		log.info(" and body - " + body);
		
	}

}
