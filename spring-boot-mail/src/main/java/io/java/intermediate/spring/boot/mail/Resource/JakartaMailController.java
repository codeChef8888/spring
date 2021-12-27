package io.java.intermediate.spring.boot.mail.Resource;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.intermediate.spring.boot.mail.Configuration.EmailConfig;
import io.java.intermediate.spring.boot.mail.Models.ReportFeedBack;

@RestController
@RequestMapping("/forward")
public class JakartaMailController {

	@Autowired
	EmailConfig emailConfig;

	@PostMapping
	public void forwardEmail(@RequestBody ReportFeedBack name) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", this.emailConfig.getHost());
		props.put("mail.smtp.port", this.emailConfig.getPort());

		// get session object
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emailConfig.getUserName(), emailConfig.getPassword());
			}
		});

		try {
			// create a default MimeMessage object.
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("progressiveLabs@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(name.getEmail()));
			message.setSubject("this is a drill!!!!!");
			message.setContent(

					"	<html>\r\n" + 
					"<head>\r\n" + 
					"<title>Prepg form format copyyyyyyyyyyyyyyy copy</title>\r\n" + 
					"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n" + 
					"</head>\r\n" + 
					"<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n" + 
					"<!-- Save for Web Slices (Prepg form format copyyyyyyyyyyyyyyy copy) -->\r\n" + 
					"<table id=\"Table_01\" width=\"1001\" height=\"879\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"32\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384397/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_01_vkmuxv.gif\" width=\"1000\" height=\"23\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"23\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"15\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384744/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_02_koz6lp.gif\" width=\"24\" height=\"616\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"13\">\r\n" + 
					"			<a href=\"http://prepgnepal.com/\" target=\"http://prepgnepal.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384795/gogo/Prepg-form-format_03_s6thu0.gif\" width=\"301\" height=\"85\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"17\" rowspan=\"13\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384828/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_04_d5chnh.gif\" width=\"675\" height=\"529\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"85\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"13\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384862/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_05_brlne9.gif\" width=\"301\" height=\"93\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"93\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384892/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_06_xtipu3.gif\" width=\"40\" height=\"61\" alt=\"\"></td>\r\n" + 
					"		<td width=\"145\" height=\"20\" colspan=\"4\">Prakash Bhetwal,</td>\r\n" + 
					"		<td colspan=\"8\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384915/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_08_lj5vwi.gif\" width=\"116\" height=\"61\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"20\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"4\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384935/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_09_rs2k7h.gif\" width=\"145\" height=\"41\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"41\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td width=\"181\" height=\"17\" colspan=\"4\">Merchant Name:</td>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385191/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_11_xj6xvh.gif\" width=\"7\" height=\"58\" alt=\"\"></td>\r\n" + 
					"		<td width=\"113\" height=\"17\" colspan=\"7\">Arya Shrestha</td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"17\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"4\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385170/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_13_udq5kd.gif\" width=\"181\" height=\"41\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"7\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385230/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_14_ofqelk.gif\" width=\"113\" height=\"41\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"41\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td width=\"191\" height=\"17\" colspan=\"7\">Transaction Code</td>\r\n" + 
					"		<td rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385254/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_16_rfasao.gif\" width=\"8\" height=\"58\" alt=\"\"></td>\r\n" + 
					"		<td width=\"102\" height=\"17\" colspan=\"5\">01245</td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"17\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"7\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385291/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_18_ogtnql.gif\" width=\"191\" height=\"41\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"5\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385307/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_19_ws5nti.gif\" width=\"102\" height=\"41\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"41\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td width=\"185\" height=\"17\" colspan=\"5\">Transaction Date</td>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385333/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_21_rqx2sv.gif\" width=\"6\" height=\"57\" alt=\"\"></td>\r\n" + 
					"		<td width=\"110\" height=\"17\" colspan=\"6\">2060-10-10</td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"17\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"5\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385363/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_23_v7eoxl.gif\" width=\"185\" height=\"40\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"6\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385382/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_24_yj1eld.gif\" width=\"110\" height=\"40\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"40\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td width=\"218\" height=\"17\" colspan=\"10\" rowspan=\"2\">Transaction Amount</td>\r\n" + 
					"		<td rowspan=\"6\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385408/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_26_j0aarb.gif\" width=\"6\" height=\"230\" alt=\"\"></td>\r\n" + 
					"		<td width=\"77\" height=\"16\" colspan=\"2\">Rs. 3,000</td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"16\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"5\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385431/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_28_anbzoi.gif\" width=\"77\" height=\"214\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"1\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"10\" rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385451/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_29_mnrm0x.gif\" width=\"218\" height=\"187\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"100\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385476/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_30_amxtlk.gif\" width=\"73\" height=\"113\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"9\">\r\n" + 
					"			<a href=\"https://esewa.com.np/#/home\" target=\"https://esewa.com.np/#/home\">\r\n" + 
					"				<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy_31.jpg\" width=\"109\" height=\"22\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"7\" rowspan=\"5\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385560/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_32_tehisk.gif\" width=\"493\" height=\"140\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"22\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"9\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385579/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_33_crlhrp.gif\" width=\"109\" height=\"91\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"65\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td rowspan=\"11\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385601/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_34_qow5ot.gif\" width=\"11\" height=\"170\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"4\">\r\n" + 
					"			<a href=\"http://prepgnepal.com/\" target=\"http://prepgnepal.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385760/gogo/Prepg-form-format_03-27_bqejt0.gif\" width=\"176\" height=\"26\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"7\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385797/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_36_mhb9jn.gif\" width=\"55\" height=\"26\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"26\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"3\">\r\n" + 
					"			<a href=\"http://prepgnepal.com/\" target=\"http://prepgnepal.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385833/gogo/Prepg-form-format_03-29_r0cnh2.gif\" width=\"154\" height=\"2\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"16\" rowspan=\"2\">\r\n" + 
					"			<a href=\"http://progressivelabs.tech/\" target=\"http://progressivelabs.tech/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385866/gogo/Prepg-form-format_06_hymvc8.gif\" width=\"262\" height=\"27\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"5\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385889/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_39_v6x99s.gif\" width=\"80\" height=\"27\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"2\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"3\" rowspan=\"6\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385909/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_40_xppkke.gif\" width=\"154\" height=\"63\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"25\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"14\">\r\n" + 
					"			<a href=\"http://progressivelabs.tech/\" target=\"http://progressivelabs.tech/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385935/gogo/Prepg-form-format_06-33_poc2jy.gif\" width=\"252\" height=\"7\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"13\" rowspan=\"4\">\r\n" + 
					"			<a href=\"mailto:progressivelabs@gmail.com\" target=\"mailto:progressivelabs@gmail.com\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385958/gogo/Prepg-form-format_13_ilrnj4.gif\" width=\"345\" height=\"37\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td rowspan=\"8\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580385984/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_43_t7hijf.gif\" width=\"238\" height=\"117\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"7\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td width=\"143\" height=\"28\" colspan=\"10\" rowspan=\"2\">01-444222</td>\r\n" + 
					"		<td colspan=\"4\">\r\n" + 
					"			<a href=\"http://progressivelabs.tech/\" target=\"http://progressivelabs.tech/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386015/gogo/Prepg-form-format_06-36_bv9s5l.gif\" width=\"109\" height=\"2\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"2\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"4\" rowspan=\"6\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386042/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_46_cov7hj.gif\" width=\"109\" height=\"108\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"26\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"10\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386065/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_47_bi0umb.gif\" width=\"143\" height=\"3\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"2\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"13\" rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386098/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_48_wzzpb5.gif\" width=\"345\" height=\"71\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"1\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"10\">\r\n" + 
					"			<a href=\"http://prepgnepal.com/\" target=\"http://prepgnepal.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386131/gogo/Prepg-form-format_13_mjdt68.gif\" width=\"216\" height=\"28\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"3\" rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386167/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_50_n2olo8.gif\" width=\"81\" height=\"79\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"28\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"10\" rowspan=\"2\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386197/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_51_rkgrp0.gif\" width=\"216\" height=\"51\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"42\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td rowspan=\"4\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386223/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_52_bkordb.gif\" width=\"4\" height=\"24\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"9\" rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386239/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_53_d6qttp.jpg\" width=\"158\" height=\"18\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386257/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_54_x8bmfb.gif\" width=\"183\" height=\"9\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"9\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"18\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_55.gif\" width=\"417\" height=\"5\" alt=\"\"></td>\r\n" + 
					"		<td rowspan=\"3\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_56.gif\" width=\"3\" height=\"15\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"3\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_57.gif\" width=\"418\" height=\"5\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"5\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"18\" rowspan=\"2\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_58.gif\" width=\"417\" height=\"10\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"3\" rowspan=\"2\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_59.gif\" width=\"418\" height=\"10\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"4\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"9\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386311/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_60_bl89fh.gif\" width=\"158\" height=\"6\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"6\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"17\" rowspan=\"3\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_61.gif\" width=\"400\" height=\"54\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"4\">\r\n" + 
					"			<a href=\"https://www.facebook.com/progressivelabsnp/\" target=\"https://www.facebook.com/progressivelabsnp/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386336/gogo/Prepg-form-format_07_vbhgra.gif\" width=\"45\" height=\"43\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386372/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_63_c5lrgj.gif\" width=\"8\" height=\"54\" alt=\"\"></td>\r\n" + 
					"		<td rowspan=\"2\">\r\n" + 
					"			<a href=\"https://www.twitter.com\" target=\"twitter.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386392/gogo/Prepg-form-format_10_he8uvz.gif\" width=\"43\" height=\"44\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386416/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_65_y1kdlo.gif\" width=\"8\" height=\"54\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"2\">\r\n" + 
					"			<a href=\"http://instagram.com/\" target=\"http://instagram.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386473/gogo/Prepg-form-format_10-57_wtjkun.gif\" width=\"45\" height=\"44\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386493/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_67_ryrw89.gif\" width=\"7\" height=\"54\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"3\" rowspan=\"2\">\r\n" + 
					"			<a href=\"http://youtube.com/\" target=\"http://youtube.com/\">\r\n" + 
					"				<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386511/gogo/Prepg-form-format_12_tfz3lj.png\" width=\"44\" height=\"44\" border=\"0\" alt=\"\"></a></td>\r\n" + 
					"		<td colspan=\"2\" rowspan=\"3\">\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580386534/gogo/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_69_pdlnen.gif\" width=\"400\" height=\"54\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"43\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td colspan=\"4\" rowspan=\"2\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_70.gif\" width=\"45\" height=\"11\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"1\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_71.gif\" width=\"43\" height=\"10\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"2\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_72.gif\" width=\"45\" height=\"10\" alt=\"\"></td>\r\n" + 
					"		<td colspan=\"3\">\r\n" + 
					"			<img src=\"images/Prepg-form-format-copyyyyyyyyyyyyyyy-copy_73.gif\" width=\"44\" height=\"10\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"1\" height=\"10\" alt=\"\"></td>\r\n" + 
					"	</tr>\r\n" + 
					"	<tr>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"11\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"13\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"40\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"101\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"https://res.cloudinary.com/ddiej3lms/image/upload/v1580384452/gogo/spacer_nhz1gy.gif\" width=\"22\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"18\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"4\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"3\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"3\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"8\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"4\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"15\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"6\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"60\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"17\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"73\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"2\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"17\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"4\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"6\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"18\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"8\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"43\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"8\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"3\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"42\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"7\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"23\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"3\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"18\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"162\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td>\r\n" + 
					"			<img src=\"images/spacer.gif\" width=\"238\" height=\"1\" alt=\"\"></td>\r\n" + 
					"		<td></td>\r\n" + 
					"	</tr>\r\n" + 
					"</table>\r\n" + 
					"<!-- End Save for Web Slices -->\r\n" + 
					"</body>\r\n" + 
					"</html>",
					"text/html");

			Transport.send(message);

		} catch (MessagingException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}

	}

}
