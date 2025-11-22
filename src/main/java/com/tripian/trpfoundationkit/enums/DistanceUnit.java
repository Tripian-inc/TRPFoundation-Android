package com.tripian.trpfoundationkit.enums;

public enum DistanceUnit {
    K('K'), C('N');

    public char asChar() {
        return asChar;
    }

    private final char asChar;

    DistanceUnit(char asChar) {
        this.asChar = asChar;
    }
}