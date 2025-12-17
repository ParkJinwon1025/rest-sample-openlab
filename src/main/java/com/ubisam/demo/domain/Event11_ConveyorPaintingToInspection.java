package com.ubisam.demo.domain;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event11_ConveyorPaintingToInspection {

    @Id
    private Long timestamp;
    private ObjectPainting paintingObject;
    private ObjectConveyor conveyorObject;
    private ObjectProduct productObject;
    private ObjectInspection inspectionObject;
    private String action; 
    
}
