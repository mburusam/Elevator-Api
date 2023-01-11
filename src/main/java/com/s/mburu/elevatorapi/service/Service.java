package com.s.mburu.elevatorapi.service;

import com.s.mburu.elevatorapi.DTO.ElevatorDTO;
import com.s.mburu.elevatorapi.entities.Log;

import java.util.List;

public interface Service {
    void callElevator(long elevatorId, int fromFloor, int toFloor);
    ElevatorDTO getElevatorStatus(long elevatorId);
    List<Log> getElevatorLogs(long elevatorId);


}



