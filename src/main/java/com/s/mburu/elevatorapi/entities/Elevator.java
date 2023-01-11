package com.s.mburu.elevatorapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Elevator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int theCurrentFloor;
    private Direction direction;
    private State state;
    @OneToMany(mappedBy = "elevator",cascade = CascadeType.ALL)
    private List<Log>logs;


}
