package com.s.mburu.elevatorapi.entities;

import lombok.Data;

@Data
public class State {
    private boolean doorOpen;
    private boolean moving;
    private boolean doorClose;
}
