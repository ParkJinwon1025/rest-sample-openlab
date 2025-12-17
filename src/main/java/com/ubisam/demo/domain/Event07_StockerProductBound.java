package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event07_StockerProductBound {

    @Id
    private Long timestamp;
    private ObjectStocker stockerObject;
    private ObjectProduct productObject;
    private String action;
    
}
