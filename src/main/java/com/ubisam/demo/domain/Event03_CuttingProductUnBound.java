package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event03_CuttingProductUnBound {

    @Id
    private Long timestamp;
    private ObjectCutting cuttingObject;
    private ObjectTransfer transferObject;
    private ObjectProduct productObject;
    private String action; 
    
}
