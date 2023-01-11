package com.s.mburu.elevatorapi.service;

import com.s.mburu.elevatorapi.DTO.ElevatorDTO;
import com.s.mburu.elevatorapi.entities.Log;
import com.s.mburu.elevatorapi.repository.ElevatorRepository;
import com.s.mburu.elevatorapi.repository.LogRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    private final ElevatorRepository elevatorRepository;
    private final LogRepository logRepository;

    public ServiceImpl(ElevatorRepository elevatorRepository, LogRepository logRepository) {
        this.elevatorRepository = elevatorRepository;
        this.logRepository = logRepository;
    }

    @Override
    public void callElevator(long elevatorId, int fromFloor, int toFloor) {

    }

    @Override
    public ElevatorDTO getElevatorStatus(long elevatorId) {
        return null;
    }

    @Override
    public List<Log> getElevatorLogs(long elevatorId) {
        return null;
    }
}
