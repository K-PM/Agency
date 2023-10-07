package com.escuelita.demo.controllers.dtos.responses;

import com.escuelita.demo.entities.Brand;
import com.escuelita.demo.entities.Engine;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;

@Getter  @Setter
public class CreateVehicleResponse {

    private Long id;

    private int year;

    private double price;

    private double mileage;

    private String color;

    private String model;

    private OwnerResponse ownerName;
    private BrandResponse brand;
    private EngineResponse engine;

}
