package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01_3DPrinting {

    @Id
    private Long timestamp;
    private ObjectProduct productObject;
    private Object3DPrinter printer;
    private String action;
    
}
