package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event05_ConveyorCuttingToInspection {

    @Id
    private Long timestamp;
    private ObjectCutting cuttingObject;
    private ObjectConveyor conveyorObject;
    private ObjectProduct productObject;
    private ObjectInspection inspectionObject;
    private String action; 
    
}
