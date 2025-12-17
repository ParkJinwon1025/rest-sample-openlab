package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event04_Cutting {

    @Id
    private Long timestamp;
    private ObjectCutting cuttingObject;
    private ObjectProduct productObject;
    private String action;
}
