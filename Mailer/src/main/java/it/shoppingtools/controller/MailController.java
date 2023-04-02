package it.shoppingtools.controller;

import it.shoppingtools.dto.MailDTO;
import it.shoppingtools.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@Slf4j
public class MailController extends AbstractController<MailDTO> {

        @Autowired
        private MailService emailSender;

        @PostMapping("/verifymail")
        public void VerificationMail(@RequestBody MailDTO mailDTO) throws MessagingException {

            String body = emailSender.generateEmailBody(mailDTO.getMessage(), mailDTO.getUUID());
            emailSender.sendEmail(mailDTO.getEmail(), mailDTO.getObject(),body);
        }
}