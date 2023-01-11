package com.s.mburu.elevatorapi.DTO;


import com.s.mburu.elevatorapi.entities.State;
import lombok.Data;

@Data
public class StateDTO {
    private boolean isdoorOpen;
    private boolean ismoving;

    public boolean isIsdoorOpen() {
        return isdoorOpen;
    }

    public void setIsdoorOpen(boolean isdoorOpen) {
        this.isdoorOpen = isdoorOpen;
    }

    public boolean isIsmoving() {
        return ismoving;
    }

    public void setIsmoving(boolean ismoving) {
        this.ismoving = ismoving;
    }
}



