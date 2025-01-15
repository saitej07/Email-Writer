package com.saiteja.email_writer.controller;

import com.saiteja.email_writer.model.EmailRequest;
import com.saiteja.email_writer.service.EmailGenerateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGenerateController {

    private final EmailGenerateService emailGenerateService;


    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGenerateService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
