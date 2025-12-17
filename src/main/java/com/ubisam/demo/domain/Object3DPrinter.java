package com.ubisam.demo.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Object3DPrinter {

    @Id
    private UUID id;
    private String name;
    
}
