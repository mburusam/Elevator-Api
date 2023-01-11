package com.s.mburu.elevatorapi.DTO;

import com.s.mburu.elevatorapi.entities.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElevatorDTO {
    private Long id;
    private int theCurrentFloor;
    private Direction direction;
    private StateDTO theCurrentState;

}
