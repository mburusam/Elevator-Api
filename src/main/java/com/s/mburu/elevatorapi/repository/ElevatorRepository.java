package com.s.mburu.elevatorapi.repository;

import com.s.mburu.elevatorapi.entities.Elevator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElevatorRepository extends JpaRepository<Elevator,Long> {

}
