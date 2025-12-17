package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event10_PaintingProductUnBound {

    @Id
    private Long timestamp;
    private ObjectPainting paintingObject;
    private ObjectStocker  stockerObject;  
    private ObjectProduct productObject;
    private String action;
    
}
