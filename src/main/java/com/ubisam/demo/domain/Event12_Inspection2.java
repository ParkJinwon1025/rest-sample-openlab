package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event12_Inspection2 {

    @Id
    private Long timestamp;
    private ObjectInspection inspectionObject;
    private ObjectProduct productObject;
    private String action;
    
}
