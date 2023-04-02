package it.shoppingtools.service;

import it.shoppingtools.dto.MailDTO;
import it.shoppingtools.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MailService extends AbstractService<MailDTO, Mail> {


    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String body) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom("paxidroid@gmail.com");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(body);

        javaMailSender.send(message);
    }

    public String generateEmailBody(String bodyTemplate, String uuid) {
        String[] parts = bodyTemplate.split("uuid");
        Stream<String> stream = Stream.of(parts);
        return stream
            .flatMap(s -> Stream.of(s, uuid))
            .skip(1)
            .collect(Collectors.joining());
    }

}
