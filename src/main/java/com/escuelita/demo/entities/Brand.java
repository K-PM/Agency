package com.escuelita.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "Brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String headquarter;

    @Column(nullable = false)
    private String website;


    @OneToMany(mappedBy = "brand")
    private List<Vehicle> vehicles;

}
