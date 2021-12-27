package io.java.intermediate.spring.boot.mail.Resource;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.intermediate.spring.boot.mail.Models.ReportFeedBack;

@RestController
@RequestMapping("/retrive")
public class MailController {

	@Autowired
	JavaMailSender javaMailSender;
	
	@PostMapping
	public void sendReportMail(@RequestBody ReportFeedBack report, BindingResult bindingResult) throws IOException, MessagingException {
		if (bindingResult.hasErrors()) {
			throw new ValidationException("Email is not valid");
		}
		

        MimeMessage msg = javaMailSender.createMimeMessage();

        // true = multipart message
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		
        helper.setTo(report.getEmail());

        helper.setSubject("Testing from Spring Boot");

        // default = text/plain
        //helper.setText("Check attachment for image!");

        // true = text/html
        helper.setText("<h1>Check attachment for your Report!!!</h1>", true);

       
		// hard coded a file path
        FileSystemResource file = new FileSystemResource(new File("E://Reviews-export.xlsx"));

	helper.addAttachment("blah.xlsx", file);
//        helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));

        javaMailSender.send(msg);
		
	}
}
