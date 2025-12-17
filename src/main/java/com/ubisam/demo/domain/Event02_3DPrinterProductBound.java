package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event02_3DPrinterProductBound {

    @Id
    private Long timestamp;
    private ObjectBinPick binPickObject;
    private ObjectTransfer transferObject;
    private String action; 
    
}
