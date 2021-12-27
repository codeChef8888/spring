package io.java.intermediate.spring.boot.mail.Resource;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.validation.ValidationException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.intermediate.spring.boot.mail.Configuration.EmailConfig;
import io.java.intermediate.spring.boot.mail.Models.ReportFeedBack;

@RestController
@RequestMapping("/feedback")
public class EmailController {

	@Autowired
	EmailConfig emailCfg;

	@PostMapping
	public void sendReportMail(@RequestBody ReportFeedBack report, BindingResult bindingResult) throws IOException {
		if (bindingResult.hasErrors()) {
			throw new ValidationException("Email is not valid");
		}

		// Create a mail sender
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(this.emailCfg.getHost());
		mailSender.setPort(this.emailCfg.getPort());
		mailSender.setUsername(this.emailCfg.getUserName());
		mailSender.setPassword(this.emailCfg.getPassword());

		// Create an email instance
//		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setFrom("progressiveLabs@mail.mailcom");
//		mailMessage.setTo(report.getEmail());
//		mailMessage.setSubject("this is the remix from " + report.getName());
//		mailMessage.setText(report.getFeedback());

		// Attaching a file 1O1
//		MimeMessagePreparator preparator = new MimeMessagePreparator() {
//
//			@Override
//			public void prepare(MimeMessage mimeMessage) throws Exception {
//				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(report.getEmail()));
//				mimeMessage.setFrom(new InternetAddress("progressiveLabs@mail.com"));
//				mimeMessage.setSubject("this is your repot " + report.getName());
//				mimeMessage.setText(report.getFeedback());
//
//				FileSystemResource file = new FileSystemResource(new File("E:\\"));
//				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//				helper.addAttachment(MimeUtility.encodeText("")), new ByteArrayResource(IOUtils.toByteArray(inputStream)));
//				helper.setText("", true);
////				helper.addAttachment("Reviews-export.xlsx", file);
//			}
//		};
//
//		try {
//			mailSender.send(preparator);
//		}catch(MailException ex){
//			System.out.println(ex.getMessage());
//		}
		
		// Attaching a file 1O2
		  Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", this.emailCfg.getHost());
	      props.put("mail.smtp.port", this.emailCfg.getPort());
		
	      // Get the Session object.
	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(emailCfg.getUserName(), emailCfg.getPassword());
	            }
	         });
	      
	      try {
	      Message message = new MimeMessage(session);
	      message.setFrom(new InternetAddress("progressiveLabs@gmail.com"));
	      message.setRecipients(Message.RecipientType.TO,
	              InternetAddress.parse(report.getEmail()));
	      message.setSubject("TESTING SPRING BOOT MAILER");

	      MimeBodyPart messageBodyPart = new MimeBodyPart();
	      messageBodyPart.setText("<h1>Check attachment for YOUR REPORT!!</h1>");

	     MimeBodyPart attachmentBodyPart = new MimeBodyPart();

	     File filetosend = new File("E:\\report.pdf");
	      System.out.println("The filetosend is ="+filetosend);
	      DataSource source = new FileDataSource(filetosend);
	      System.out.println("The source is ="+source);

	      attachmentBodyPart.attachFile(filetosend);
	      System.out.println("The file name is ="+attachmentBodyPart.getFileName());

	      Multipart multipart = new MimeMultipart();
	      multipart.addBodyPart(messageBodyPart);
	      multipart.addBodyPart(attachmentBodyPart);

	      message.setContent(multipart);
	      System.out.println("The message multi part is ="+multipart);

	      System.out.println("Sending");

	      Transport.send(message);
	      }catch(MessagingException ex) {
	    	  System.out.println(ex.getMessage());
	      }
				
		
		
		// Send Mail
//		mailSender.send(mailMessage);

	}
}
