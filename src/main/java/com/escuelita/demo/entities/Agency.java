package com.escuelita.demo.entities;

import com.escuelita.demo.entities.pivots.AgencyVehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "Agencies")
public class Agency {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private Long cellphone_number;

    @OneToMany(mappedBy="agency")
    private List<AgencyVehicle>agencyVehicles;
}
