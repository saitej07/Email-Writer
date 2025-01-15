package com.saiteja.email_writer.model;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;
}
