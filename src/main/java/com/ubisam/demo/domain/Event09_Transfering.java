package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event09_Transfering {

    @Id
    private Long timestamp;
    private ObjectTransfer transferObject;
    private ObjectProduct productObject;
    private String action;
    
}
